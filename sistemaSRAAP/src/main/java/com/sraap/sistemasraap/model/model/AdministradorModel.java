package com.sraap.sistemasraap.model.model;

import com.sraap.sistemasraap.model.DAO.DAO;
import com.sraap.sistemasraap.model.entidades.Administrador;
import com.sraap.sistemasraap.model.entidades.Usuario;
import org.hibernate.HibernateException;

public class AdministradorModel {
	
	private DAO<Administrador> administradorHibernate;
	
	public void inserir(Administrador adm) throws HibernateException, Exception{
		try {
			this.administradorHibernate.inserir(adm);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void excluir(Administrador adm) throws HibernateException, Exception{
		try {
			this.administradorHibernate.deletar(adm);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void atualizar(Administrador adm) throws HibernateException, Exception{
		try {
			this.administradorHibernate.atualizar(adm);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Usuario buscarID(Administrador adm) throws HibernateException, Exception{
		try {
			return this.administradorHibernate.buscarPeloID(Administrador.class, adm.getId());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
