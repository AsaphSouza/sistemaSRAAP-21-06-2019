package com.sraap.sistemasraap.controller;

import com.sraap.sistemasraap.model.entidades.Avaliacao;
import com.sraap.sistemasraap.model.model.AvaliacaoModel;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import org.hibernate.HibernateException;

@ManagedBean
@ViewScoped
public class AvaliacaoController {
	
	private AvaliacaoModel avaliacaoModel;
	private Avaliacao avaliacao;
	
	public AvaliacaoController () {
		avaliacao = new Avaliacao();
		avaliacaoModel = new AvaliacaoModel();
	}
	
	public void cadastrar() {
		try {
			avaliacaoModel.inserir(getAvaliacao());

		} catch (HibernateException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void deletar() {
		try {
			avaliacaoModel.excluir(getAvaliacao());

		} catch (HibernateException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void atualizar() {
		try {
			avaliacaoModel.atualizar(getAvaliacao());

		} catch (HibernateException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Avaliacao buscarID() {
		try {
			return avaliacaoModel.buscarID(getAvaliacao());

		} catch (HibernateException e) {
			e.printStackTrace();
			return null;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public AvaliacaoModel getAvaliacaoModel() {
		return avaliacaoModel;
	}

	public void setAvaliacaoModel(AvaliacaoModel avaliacaoModel) {
		this.avaliacaoModel = avaliacaoModel;
	}

	public Avaliacao getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}

}
