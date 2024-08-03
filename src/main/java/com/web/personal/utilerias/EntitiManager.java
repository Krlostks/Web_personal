/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.personal.utilerias;

import java.util.Iterator;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Query;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

/**
 *
 * @author Brayan Mendoza Mejorada
 */
public abstract class EntitiManager<Entity> {

    private static final Logger LOG = Logger.getLogger(EntitiManager.class.getName());

    private Class<Entity> entityClass;

    public EntitiManager(Class<Entity> entityClass) {
        this.entityClass = entityClass;
    }

    protected abstract persistence getEntityManager();

    public Entity saveOrEdit(Entity entity, Object id) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<Entity>> constraintViolations = validator.validate(entity);
        if (constraintViolations.size() > 0) {
            Iterator<ConstraintViolation<Entity>> iterator = constraintViolations.iterator();
            while (iterator.hasNext()) {
                ConstraintViolation<Entity> cv = iterator.next();
                LOG.log(Level.SEVERE, "Error en la entidad: {0}", cv.getMessage());
                LOG.log(Level.SEVERE, "Error en la entidad: {0}", cv.getPropertyPath());
            }
        }
        if (id.equals(0)) {
            getEntityManager().getEm().persist(entity);
        } else {
            getEntityManager().getEm().merge(entity);
        }
        getEntityManager().getEm().flush();
        return entity;
    }

    public Entity guardar(Entity entity, Object id) {
        if (id.equals(0)) {
            getEntityManager().getEm().persist(entity);
        } else {
            getEntityManager().getEm().merge(entity);
        }
        getEntityManager().getEm().flush();
        return entity;
    }

    public void eliminar(Entity entity) {
        getEntityManager().getEm().remove(getEntityManager().getEm().merge(entity));
    }

    public Entity consultar(Object id) {
        return getEntityManager().getEm().find(entityClass, id);
    }

    public List<Entity> obtenerListaCompleta() {
        CriteriaQuery cq = getEntityManager().getEm().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        Root<Entity> pet = cq.from(entityClass);
        cq.orderBy(getEntityManager().getEm().getCriteriaBuilder().asc(pet.get("id")));
        return getEntityManager().getEm().createQuery(cq).getResultList();
    }

    public List<Entity> findWithNamedQuery(String namedQueryName) {
        return getEntityManager().getEm().createNamedQuery(namedQueryName).getResultList();
    }

    public List<Entity> findWithQuery(String queryName) {
        return getEntityManager().getEm().createQuery(queryName).getResultList();
    }

    public List<Entity> findByNativeQuery(String sql) {
        return getEntityManager().getEm().createNativeQuery(sql, entityClass).getResultList();
    }

    public Entity getFirst(Query query) {
        return (Entity) query.setMaxResults(1).getResultList().stream().findFirst().orElse(null);
    }
}