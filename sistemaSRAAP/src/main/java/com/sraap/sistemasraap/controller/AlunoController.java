package com.sraap.sistemasraap.controller;

import com.sraap.sistemasraap.model.entidades.Aluno;
import com.sraap.sistemasraap.model.model.AlunoModel;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.persistence.NoResultException;
import org.hibernate.HibernateException;

@ManagedBean
@ViewScoped
public class AlunoController {

	private AlunoModel alunoModel;
	private Aluno aluno;

	public AlunoController() {
		this.alunoModel = new AlunoModel();
		this.aluno = new Aluno();
	}

	public void cadastrar() {
		try {
			alunoModel.inserir(getAluno());
			
		} catch (HibernateException e) {
			e.printStackTrace();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deletar() {
		try {
			alunoModel.excluir(getAluno());
			
		} catch (HibernateException e) {
			e.printStackTrace();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void atualizar() {
		try {
			alunoModel.atualizar(getAluno());
			
		} catch (HibernateException e) {
			e.printStackTrace();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Aluno buscarID() {
		try {
			return alunoModel.buscarID(getAluno());
			
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Aluno> listarPorPerfil() {
		try {
			return alunoModel.ListarPorPerfil(getAluno().getPerfil());
			
		} catch (NoResultException e) {
			e.printStackTrace();
			return null;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

}
