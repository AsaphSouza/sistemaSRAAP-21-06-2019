package com.sraap.sistemasraap.model.model;

import com.sraap.sistemasraap.model.DAO.DAO;
import com.sraap.sistemasraap.model.DAO.UsuarioDAO;
import com.sraap.sistemasraap.model.entidades.Administrador;
import com.sraap.sistemasraap.model.entidades.Aluno;
import com.sraap.sistemasraap.model.entidades.Professor;
import com.sraap.sistemasraap.model.entidades.Usuario;
import com.sraap.sistemasraap.model.hibernate.UsuarioHibernate;
import java.util.List;
import org.hibernate.HibernateException;

public class UsuarioModel {
	
	private DAO<Usuario> usuarioHibernate;
	
	public void inserir(Usuario user) throws HibernateException, Exception{
		try {
			this.usuarioHibernate.inserir(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void excluir(Usuario user) throws HibernateException, Exception{
		try {
			this.usuarioHibernate.deletar(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void atualizar(Usuario user) throws HibernateException, Exception{
		try {
			this.usuarioHibernate.atualizar(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Usuario buscarID(Usuario user) throws HibernateException, Exception{
		try {
			return this.usuarioHibernate.buscarPeloID(Usuario.class, user.getId());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public List<Usuario> buscarPorNome(Usuario user) throws Exception {
		try {
			return ((UsuarioHibernate) usuarioHibernate).buscarPorNome(user.getNomeCompleto());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public Usuario buscarPorEmail(Usuario user) throws Exception {
		try {
			return ((UsuarioHibernate) usuarioHibernate).buscarPorEmail(user.getEmail());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public Usuario login (String email, String senha) throws Exception {
		if (((UsuarioDAO) usuarioHibernate).login(email, senha) != null) {
			Usuario user = ((UsuarioDAO) usuarioHibernate).login(email, senha);
			return user;
		} else {
			return null;
		}
	}
}
