package com.sraap.sistemasraap.model.hibernate;

import com.sraap.sistemasraap.model.DAO.AlunoDAO;
import com.sraap.sistemasraap.model.DAO.GenericoDAO;
import com.sraap.sistemasraap.model.entidades.Aluno;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;


public class AlunoHibernate extends GenericoDAO<Aluno> implements AlunoDAO{
	
	private final EntityManager em = Persistencia.getEntityManager();

	@Override
	public List<Aluno> buscarPorPerfil(String perfil) throws NoResultException, Exception {
		TypedQuery<Aluno> query; 
		try {
			
			query = em.createQuery("from aluno where perfil =:perfil",Aluno.class);
            query.setParameter("perfil", perfil);
            return  query.getResultList();
            
		} catch (NoResultException e) {
			return null;
			
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
	
}