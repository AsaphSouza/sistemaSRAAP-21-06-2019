package com.sraap.sistemasraap.model.model;

import com.sraap.sistemasraap.model.DAO.DAO;
import com.sraap.sistemasraap.model.entidades.Professor;
import com.sraap.sistemasraap.model.entidades.Usuario;
import org.hibernate.HibernateException;

public class ProfessorModel {
	
	DAO<Professor> professorHibernate;
	
	public void inserir(Professor prof) throws HibernateException, Exception{
		try {
			this.professorHibernate.inserir(prof);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void excluir(Professor prof) throws HibernateException, Exception{
		try {
			this.professorHibernate.deletar(prof);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void atualizar(Professor prof) throws HibernateException, Exception{
		try {
			this.professorHibernate.atualizar(prof);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Usuario buscarID(Professor prof) throws HibernateException, Exception{
		try {
			return this.professorHibernate.buscarPeloID(Professor.class, prof.getId());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
