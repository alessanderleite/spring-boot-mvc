package br.com.alessanderleite.boot.service;

import java.util.List;

import br.com.alessanderleite.boot.domain.Funcionario;

public interface FuncionarioService {
	
	void salvar(Funcionario funcionario);
	void editar(Funcionario funcionario);
	void excluir(Long id);
	Funcionario buscarPorId(Long id);
	List<Funcionario> buscarTodos();
	List<Funcionario> buscarPorNome(String nome);
}
