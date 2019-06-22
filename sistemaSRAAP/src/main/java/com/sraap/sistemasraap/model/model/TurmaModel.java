package com.sraap.sistemasraap.model.model;

import com.sraap.sistemasraap.model.DAO.DAO;
import com.sraap.sistemasraap.model.entidades.Turma;
import org.hibernate.HibernateException;

public class TurmaModel {

	DAO<Turma> TurmaHibernate;

	public void inserir(Turma turma) throws HibernateException, Exception {
		try {
			this.TurmaHibernate.inserir(turma);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void excluir(Turma turma) throws HibernateException, Exception {
		try {
			this.TurmaHibernate.deletar(turma);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void atualizar(Turma turma) throws HibernateException, Exception {
		try {
			this.TurmaHibernate.atualizar(turma);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Turma buscarID(Turma turma) throws HibernateException, Exception {
		try {
			return this.TurmaHibernate.buscarPeloID(Turma.class, turma.getId());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
