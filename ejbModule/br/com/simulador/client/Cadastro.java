package br.com.simulador.client;

import java.io.Serializable;

public interface Cadastro {
	public boolean cadastrar(Serializable obj);
	public boolean excluir(Serializable obj);
	public boolean atualizar(Serializable obj);
	public boolean selecionar(Serializable obj);
	
}
