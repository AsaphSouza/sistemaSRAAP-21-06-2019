package com.sraap.sistemasraap.controller;

import com.sraap.sistemasraap.model.entidades.Professor;
import com.sraap.sistemasraap.model.entidades.Usuario;
import com.sraap.sistemasraap.model.model.ProfessorModel;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import org.hibernate.HibernateException;

@ManagedBean
@ViewScoped
public class ProfessorController {
	
	private ProfessorModel professorModel;
	private Professor professor;
	
	public ProfessorController () {
		professor = new Professor();
		professorModel = new ProfessorModel();
	}
	
	public void cadastrar() {
		try {
			professorModel.inserir(getProfessor());

		} catch (HibernateException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void deletar() {
		try {
			professorModel.excluir(getProfessor());

		} catch (HibernateException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void atualizar() {
		try {
			professorModel.atualizar(getProfessor());

		} catch (HibernateException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Usuario buscarID() {
		try {
			return professorModel.buscarID(getProfessor());

		} catch (HibernateException e) {
			e.printStackTrace();
			return null;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
}
