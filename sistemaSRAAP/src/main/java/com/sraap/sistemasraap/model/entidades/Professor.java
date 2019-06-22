package com.sraap.sistemasraap.model.entidades;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "professor")
@DiscriminatorValue("PROFESSOR")
public class Professor extends Usuario{

	private static final long serialVersionUID = 1L;
	
	@OneToMany
	private List<Turma> turmas;
	
	@OneToMany
	private List<Atividade> atividades;
	
	public Professor() {

	}
	
}
