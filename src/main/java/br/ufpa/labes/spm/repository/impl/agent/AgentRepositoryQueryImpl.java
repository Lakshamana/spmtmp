package br.ufpa.labes.spm.repository.impl.agent;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.agent.AgentRepositoryQuery;
import br.ufpa.labes.spm.service.dto.AgentDTO;
import br.ufpa.labes.spm.domain.Agent;

public class AgentRepositoryQueryImpl extends BaseRepositoryQueryImpl<Agent, Long> implements AgentRepositoryQuery{

  protected AgentRepositoryQueryImpl(Class<Agent> businessClass) {
    super(businessClass);
  }

  public AgentRepositoryQueryImpl() {
    super(Agent.class);
  }

  @Override
  public AgentDTO login(String name, String password) {

    Query query =
        getPersistenceContext()
            .createQuery(
                "SELECT agent FROM "
                    + Agent.class.getName()
                    + " AS agent "
                    + "WHERE agent.name like :name and agent.password like :password");

    query.setParameter("name", name);
    query.setParameter("password", password);
    try {

      return (AgentDTO) query.getSingleResult();

    } catch (Exception e) {

      return null;
    }
  }

  public Class<Agent> getBusinessClass() {
    return this.businessClass;
  }
}
