package br.com.alessanderleite.boot.service;

import java.util.List;

import br.com.alessanderleite.boot.domain.Departamento;

public interface DepartamentoService {

	void salvar(Departamento departamento);
	void editar(Departamento departamento);
	void excluir(Long id);
	Departamento buscarPorId(Long id);
	List<Departamento> buscarTodos();
	boolean departamentoTemCargos(Long id);
}
