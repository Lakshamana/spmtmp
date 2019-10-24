package br.ufpa.labes.spm.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.ufpa.labes.spm.converter.Converter;
import br.ufpa.labes.spm.converter.ConverterImpl;
import br.ufpa.labes.spm.exceptions.ImplementationException;
import br.ufpa.labes.spm.repository.ResourceRepository;
import br.ufpa.labes.spm.repository.ResourceTypeRepository;
import br.ufpa.labes.spm.repository.interfaces.GenericRepository;
import br.ufpa.labes.spm.service.dto.ResourceDTO;
import br.ufpa.labes.spm.service.dto.ResourcesDTO;
import br.ufpa.labes.spm.service.dto.TypesDTO;
import br.ufpa.labes.spm.domain.Resource;
import br.ufpa.labes.spm.domain.ResourceType;
import br.ufpa.labes.spm.domain.Type;
import br.ufpa.labes.spm.service.interfaces.ResourceServices;

@Service
@Transactional
public class ResourceServicesImpl implements ResourceServices{
	private static final int SINGLE_RESULT = 1;

	private static final String RESOURCE_CLASS_NAME = Resource.class.getSimpleName();

  @Autowired
	GenericRepository<Resource, Long> resourceRepository;

  @Autowired
	GenericRepository<ResourceType, Long> resourceTypeRepository;

	Converter converter = new ConverterImpl();

	private Query query;

	@Override
	public ResourceDTO getResource(String resourceIdent) {
		Resource resource = resourceRepository.retrieveBySecondaryKey(resourceIdent);
		ResourceDTO dto = this.convertResourceToResourceDTO(resource);
		return dto;
	}

	@Override
	public ResourcesDTO getResources() {
		String hql;
			hql = "select resource from " + RESOURCE_CLASS_NAME + " as resource";
		TypedQuery<Resource> query = resourceRepository.getPersistenceContext().createQuery(hql, Resource.class);
		List<Resource> resources = query.getResultList();

		return this.convertResourcesToResourcesDTO(resources);
	}

	@SuppressWarnings("unchecked")
	@Override
	public ResourcesDTO getResources(String termoBusca, String domainFilter, Boolean orgFilter) {

		String activeFilter = (orgFilter == null) ? "" : " and res.isActive is :orgFilter" ;

		String hql;
		if(domainFilter != null) {
			hql = "select res from " + RESOURCE_CLASS_NAME + " as res where res.name like :termo and res.ident = :domain" + activeFilter;
			query = resourceRepository.getPersistenceContext().createQuery(hql);
			query.setParameter("termo", "%"+ termoBusca + "%");
			query.setParameter("domain", domainFilter);

		} else {
			hql = "select res from " + RESOURCE_CLASS_NAME + " as res where res.name like :termo" + activeFilter;
			query = resourceRepository.getPersistenceContext().createQuery(hql);
			query.setParameter("termo", "%"+ termoBusca + "%");

		}
		if(!activeFilter.isEmpty()) {

			query.setParameter("orgFilter", orgFilter);

		}
			List<Resource> resultado = query.getResultList();

		ResourcesDTO resourcesDTO = new ResourcesDTO(new ArrayList<ResourceDTO>());
		resourcesDTO = convertResourcesToResourcesDTO(resultado);


		return resourcesDTO;
	}

	@Override
	public Resource getResourceFromName(String resourceName) {
		String hql = "select o from " + RESOURCE_CLASS_NAME + " o where o.name = :name";
		query = resourceRepository.getPersistenceContext().createQuery(hql);
		query.setParameter("name", resourceName);

		return (Resource) query.getResultList().get(0);
	}

	private Collection<Resource> getResourcesFromIdent(Collection<String> resourcesIdents) {
		List<Resource> resources = new ArrayList<Resource>();
		for(String ident : resourcesIdents) {
//			resources.add(this.getResourceFromName(name));
			resources.add(resourceRepository.retrieveBySecondaryKey(ident));
		}

		return resources;
	}

	@Override
	public ResourceDTO saveResource(ResourceDTO resourceDTO) {
		System.out.println("aqui " + resourceDTO);
		try {
			ResourceType resourceType = resourceTypeRepository.retrieveBySecondaryKey(resourceDTO.getTheResourceType());
			Resource resource = null;
			Resource belongsTo = resourceRepository.retrieveBySecondaryKey(resourceDTO.getBelongsTo());
			System.out.println("no impl");
			for (String requiresDTO : resourceDTO.getRequires()) {
				System.out.println("requires: " + requiresDTO);
			}
			Collection<Resource> requires = this.getResourcesFromIdent(resourceDTO.getRequires());
			for (String requiresDTO : resourceDTO.getRequires()) {
				System.out.println("requires: " + requiresDTO);
			}

			String hql = "SELECT o FROM " + RESOURCE_CLASS_NAME + " o WHERE o.name = '" + resourceDTO.getName() + "'";
			query = resourceRepository.getPersistenceContext().createQuery(hql);
			if(query.getResultList().size() == SINGLE_RESULT) {
				resource = (Resource) query.getSingleResult();
			}
			if(resource == null) {
				resource = (Resource) converter.getEntity(resourceDTO, Resource.class);
				resource.setTheResourceType(resourceType);
				resource.setBelongsTo(belongsTo);
				resourceRepository.save(resource);

				String newIdent = resourceRepository.generateIdent(resource.getName(), resource);
				resource.setIdent(newIdent);
				resourceDTO.setIdent(newIdent);
				resourceRepository.update(resource);
			} else {
				resource.setName(resourceDTO.getName());
				resource.setTheResourceType(resourceType);
				resource.setBelongsTo(belongsTo);
				String cost = resourceDTO.getCost();
				resource.setCost(new Float(cost));
				resource.setCurrency(resourceDTO.getCurrency());
				String mtbfTime = resourceDTO.getMtbfTime();
				resource.setMtbfTime(new Float(mtbfTime));
				resource.setMtbfUnitTime(resourceDTO.getMtbfUnitTime());
				resource.setIsActive(resourceDTO.getIsActive());
				resource.setDescription(resourceDTO.getDescription());
			}
			resource.setRequires(requires.stream().collect(Collectors.toSet()));

			resourceRepository.update(resource);
		} catch (ImplementationException e) {
			e.printStackTrace();
		}

		return resourceDTO;
	}

	@Override
	public Boolean removeResource(ResourceDTO resourceDTO) throws SQLException {

		Resource resource = resourceRepository.retrieveBySecondaryKey(resourceDTO.getIdent());
		System.out.println("aqui " + resource);
		if (resource != null){
			resourceRepository.delete(resource);
			return true;
		}
		else return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public TypesDTO getResourceTypes() {
		String hql;
		List<Type> typesLists = new ArrayList<Type>();

		hql = "from " + ResourceType.class.getSimpleName();
		query = resourceTypeRepository.getPersistenceContext().createQuery(hql);
		typesLists = query.getResultList();

		TypesDTO typesDTO = new TypesDTO(typesLists.size());
		int j = 0;
		for (Type type : typesLists) {
			String typeIdent = type.getIdent();
			String superTypeIdent = (type.getSuperType()!=null ? type.getSuperType().getIdent() : "");
			String rootType = ResourceType.class.getSimpleName();
			typesDTO.addType(typeIdent, superTypeIdent, rootType, j);
			j++;
		}
		return typesDTO;
	}

	private ResourceDTO convertResourceToResourceDTO(Resource resource) {
		ResourceDTO resourceDTO = new ResourceDTO();
		try {

			resourceDTO = (ResourceDTO) converter.getDTO(resource, ResourceDTO.class);
			resourceDTO.setCost(resource.getCost().toString());
			resourceDTO.setMtbfTime(resource.getMtbfTime().toString());
			if (resource.getBelongsTo() != null)
				resourceDTO.setBelongsTo(resource.getBelongsTo().getName());
			if (resource.getTheResourceType() != null)
        resourceDTO.setTheResourceType(resource.getTheResourceType().getIdent());
			for (Resource require : resource.getRequires()) {
				resourceDTO.getRequires().add(require.getName());
			}
		} catch (ImplementationException e) {
			e.printStackTrace();
		}

		return resourceDTO;
	}

	private ResourcesDTO convertResourcesToResourcesDTO(List<Resource> resourcesList) {
		ResourcesDTO resourcesDTOList = new ResourcesDTO(new ArrayList<ResourceDTO>());

		for(Resource resource : resourcesList) {
			resourcesDTOList.addResourceDTO(this.convertResourceToResourceDTO(resource));
		}
		return resourcesDTOList;
	}

	@Override
	public ResourceDTO updateRequireds(String resourceName) {
		ResourceDTO resourceDTO = new ResourceDTO();

		String hql = "select resource from " + RESOURCE_CLASS_NAME + " as resource where resource.name = '" + resourceName + "'";
		query = resourceRepository.getPersistenceContext().createQuery(hql);
		if(!query.getResultList().isEmpty()) {
			Resource resource = (Resource) query.getResultList().get(0);
			resource.setRequires(null);
			resourceDTO = (ResourceDTO) this.getDTOFromResource(resource);
		}

		return resourceDTO;
	}

	private ResourceDTO getDTOFromResource(Resource resource) {
		ResourceDTO resourceDTO = new ResourceDTO();
		try {
			resourceDTO = (ResourceDTO) converter.getDTO(resource, ResourceDTO.class);
		} catch (ImplementationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return resourceDTO;
	}

	@SuppressWarnings("unchecked")
	@Override
	public ResourcesDTO getRequiresResources(String resourceName) {
		String hql = "select o.requires from " + RESOURCE_CLASS_NAME + " o where o.name = :name";
		query = resourceRepository.getPersistenceContext().createQuery(hql);
		query.setParameter("name", resourceName);

		List<Resource> resultado = query.getResultList();
		for (Resource resource : resultado) {
			System.out.println(resource);
		}
		ResourcesDTO resourcesDTO = new ResourcesDTO(new ArrayList<ResourceDTO>());
		resourcesDTO = convertResourcesToResourcesDTO(resultado);
		return resourcesDTO;
	}
}
