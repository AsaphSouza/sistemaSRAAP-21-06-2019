package com.sraap.sistemasraap.model.entidades;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "aluno")
@DiscriminatorValue("ALUNO")
public class Aluno extends Usuario{

	private static final long serialVersionUID = 1L;
	
	@Column
	private String perfil;
	
//	@ManyToOne
//	private List<Turma> turmas;
	
//	@OneToMany
//	private List<Atividade> recomendacoesAtividades;

	public Aluno() {
	}

	public Aluno(String perfil) {
		this.perfil = perfil;
	}

//	public List<Atividade> getRecomendacoesAtividades() {
//		return recomendacoesAtividades;
//	}
//
//	public void setRecomendacoesAtividades(List<Atividade> recomendacoesAtividades) {
//		this.recomendacoesAtividades = recomendacoesAtividades;
//	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

//	public List<Turma> getTurmas() {
//		return turmas;
//	}
//
//	public void setTurmas(List<Turma> turmas) {
//		this.turmas = turmas;
//	}


}
