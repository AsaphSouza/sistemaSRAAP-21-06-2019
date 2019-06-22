package com.sraap.sistemasraap.controller;

import com.sraap.sistemasraap.model.entidades.Turma;
import com.sraap.sistemasraap.model.model.TurmaModel;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import org.hibernate.HibernateException;

@ManagedBean
@ViewScoped
public class TurmaController {
	
	private TurmaModel turmaModel;
	private Turma turma;
	
	public TurmaController() {
		turmaModel = new TurmaModel();
		turma = new Turma();
	}
	
	public void cadastrar() {
		try {
			turmaModel.inserir(getTurma());

		} catch (HibernateException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void deletar() {
		try {
			turmaModel.excluir(getTurma());

		} catch (HibernateException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void atualizar() {
		try {
			turmaModel.atualizar(getTurma());

		} catch (HibernateException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Turma buscarID() {
		try {
			return turmaModel.buscarID(getTurma());

		} catch (HibernateException e) {
			e.printStackTrace();
			return null;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public TurmaModel getTurmaModel() {
		return turmaModel;
	}

	public void setTurmaModel(TurmaModel turmaModel) {
		this.turmaModel = turmaModel;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
}
