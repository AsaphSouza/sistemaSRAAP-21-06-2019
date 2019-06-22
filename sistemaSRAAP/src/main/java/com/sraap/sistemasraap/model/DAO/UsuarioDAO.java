package com.sraap.sistemasraap.model.DAO;

import java.util.List;
import com.sraap.sistemasraap.model.entidades.Usuario;

public interface UsuarioDAO {
	
	public List<Usuario> buscarPorNome(String nome) throws Exception;
	public Usuario buscarPorEmail (String email) throws Exception;
	public Usuario login (String email, String password) throws Exception;
	public void logout() throws Exception;
}
