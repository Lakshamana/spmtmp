package br.ufpa.labes.spm.service.interfaces;

import java.util.List;

import br.ufpa.labes.spm.service.dto.TypeDTO;
import br.ufpa.labes.spm.service.dto.TypesDTO;

public interface TypeServices {

	public String[] getRootTypes( String typeClassName );

	public String[] getSubTypes( String typeIdent );

	public TypesDTO getTypes();

	public TypeDTO getType( String typeIdent );

	public TypeDTO saveType( TypeDTO typeDTO );

	public Boolean removeType( String typeIdent );

	public TypesDTO getTypes(String termoBusca, String domainFilter, boolean orgFilter);

	public List<br.ufpa.labes.spm.beans.editor.WebAPSEEVO> getTypesVO(String domain);

}
