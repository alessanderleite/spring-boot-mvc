package br.com.alessanderleite.boot.service;

import java.util.List;

import br.com.alessanderleite.boot.domain.Cargo;
import br.com.alessanderleite.boot.domain.Departamento;

public interface DepartamentoService {

	void salvar(Departamento departamento);
	void editar(Departamento departamento);
	void excluir(Long id);
	Cargo buscarPorId(Long id);
	List<Cargo> buscarTodos();
}
