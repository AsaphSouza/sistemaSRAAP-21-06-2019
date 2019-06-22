package com.sraap.sistemasraap.model.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "avaliacao")
public class Avaliacao implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(nullable = false)
	private int conceito1;

	@Column(nullable = false)
	private int conceito2;

	@Column(nullable = false)
	private int conceito3;

	@Column(nullable = false)
	private int conceito4;

	@Column(nullable = false)
	private int conceito5;

	@Column(nullable = false)
	private int conceito6;

	@Column(nullable = false)
	private int conceito7;

	@Column(nullable = false)
	private int conceito8;

	@ManyToOne
	private Professor professor;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getConceito1() {
		return conceito1;
	}

	public void setConceito1(int conceito1) {
		this.conceito1 = conceito1;
	}

	public int getConceito2() {
		return conceito2;
	}

	public void setConceito2(int conceito2) {
		this.conceito2 = conceito2;
	}

	public int getConceito3() {
		return conceito3;
	}

	public void setConceito3(int conceito3) {
		this.conceito3 = conceito3;
	}

	public int getConceito4() {
		return conceito4;
	}

	public void setConceito4(int conceito4) {
		this.conceito4 = conceito4;
	}

	public int getConceito5() {
		return conceito5;
	}

	public void setConceito5(int conceito5) {
		this.conceito5 = conceito5;
	}

	public int getConceito6() {
		return conceito6;
	}

	public void setConceito6(int conceito6) {
		this.conceito6 = conceito6;
	}

	public int getConceito7() {
		return conceito7;
	}

	public void setConceito7(int conceito7) {
		this.conceito7 = conceito7;
	}

	public int getConceito8() {
		return conceito8;
	}

	public void setConceito8(int conceito8) {
		this.conceito8 = conceito8;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Avaliacao other = (Avaliacao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Avaliacao [id=" + id + ", conceito1=" + conceito1 + ", conceito2=" + conceito2 + ", conceito3="
				+ conceito3 + ", conceito4=" + conceito4 + ", conceito5=" + conceito5 + ", conceito6=" + conceito6
				+ ", conceito7=" + conceito7 + ", conceito8=" + conceito8 + ", professor=" + professor + "]";
	}

}
