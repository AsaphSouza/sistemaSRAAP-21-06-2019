package com.sraap.sistemasraap.model.DAO;

public interface DAO <T> {
	
    public void inserir(T obj) throws Exception;

    public void atualizar(T obj) throws Exception;

    public void deletar(T obj) throws Exception;

    public T buscarPeloID(Class <T> classe, long id) throws Exception;
    
}
