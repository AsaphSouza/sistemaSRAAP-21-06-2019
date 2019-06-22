package com.sraap.sistemasraap.model.DAO;

import java.util.List;

import com.sraap.sistemasraap.model.entidades.Aluno;

public interface AlunoDAO {
	public List<Aluno> buscarPorPerfil (String perfil) throws Exception;
}
