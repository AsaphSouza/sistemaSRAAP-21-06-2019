package com.sraap.sistemasraap.model.model;

import com.sraap.sistemasraap.model.DAO.DAO;
import com.sraap.sistemasraap.model.entidades.Avaliacao;
import org.hibernate.HibernateException;

public class AvaliacaoModel {
	
	DAO<Avaliacao> AvaliacaoHibernate;
	
	public void inserir(Avaliacao ava) throws HibernateException, Exception{
		try {
			this.AvaliacaoHibernate.inserir(ava);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void excluir(Avaliacao ava) throws HibernateException, Exception{
		try {
			this.AvaliacaoHibernate.deletar(ava);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void atualizar(Avaliacao ava) throws HibernateException, Exception{
		try {
			this.AvaliacaoHibernate.atualizar(ava);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Avaliacao buscarID(Avaliacao ava) throws HibernateException, Exception{
		try {
			return this.AvaliacaoHibernate.buscarPeloID(Avaliacao.class, ava.getId());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
