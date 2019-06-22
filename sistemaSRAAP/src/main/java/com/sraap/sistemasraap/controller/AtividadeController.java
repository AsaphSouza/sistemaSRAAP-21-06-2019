package com.sraap.sistemasraap.controller;

import com.sraap.sistemasraap.model.entidades.Atividade;
import com.sraap.sistemasraap.model.model.AtividadeModel;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import org.hibernate.HibernateException;

@ManagedBean
@ViewScoped
public class AtividadeController {
	private AtividadeModel atividadeModel;
	private Atividade atividade;
	
	public AtividadeController () {
		atividadeModel = new AtividadeModel();
		atividade = new Atividade();
	}
	
	public void cadastrar() {
		try {
			atividadeModel.inserir(getAtividade());

		} catch (HibernateException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void deletar() {
		try {
			atividadeModel.excluir(getAtividade());

		} catch (HibernateException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void atualizar() {
		try {
			atividadeModel.atualizar(getAtividade());

		} catch (HibernateException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Atividade buscarID() {
		try {
			return atividadeModel.buscarID(getAtividade());

		} catch (HibernateException e) {
			e.printStackTrace();
			return null;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}


	public AtividadeModel getAtividadeModel() {
		return atividadeModel;
	}

	public void setAtividadeModel(AtividadeModel atividadeModel) {
		this.atividadeModel = atividadeModel;
	}

	public Atividade getAtividade() {
		return atividade;
	}

	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
	}
	
	
}
