package com.sraap.sistemasraap.model.hibernate;

import com.sraap.sistemasraap.model.DAO.GenericoDAO;
import com.sraap.sistemasraap.model.DAO.UsuarioDAO;
import com.sraap.sistemasraap.model.entidades.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;


public class UsuarioHibernate extends GenericoDAO<Usuario> implements UsuarioDAO{
	
	private final EntityManager em = Persistencia.getEntityManager();

	@Override
	public List<Usuario> buscarPorNome(String nomeCompleto) throws Exception {
		TypedQuery<Usuario> query; 
		try {
			
			query = em.createQuery("from Usuario where nome =:nomeCompleto", Usuario.class);
            query.setParameter("nome", nomeCompleto);
            return  query.getResultList();
            
		} catch (NoResultException e) {
			return null;
			
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	@Override
	public Usuario buscarPorEmail(String email) throws Exception {
		TypedQuery<Usuario> query; 
		try {
			
			query = em.createQuery("from Usuario where email =:email", Usuario.class);
            query.setParameter("email", email);
            return  query.getSingleResult();
            
		} catch (NoResultException e) {
			return null;
			
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	@Override
	public Usuario login(String email, String senha) throws Exception {
		TypedQuery<Usuario> query;
		try {
			query = em.createQuery("from Usuario where email =: email and senha =: senha", Usuario.class);
			query.setParameter("email", email);
			query.setParameter("senha", senha);
			return query.getSingleResult();
			
		} catch (NoResultException e) {
			return null;
		} catch (Exception e) {
			throw new Exception();
		}
	}

	@Override
	public void logout() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
