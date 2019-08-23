package br.com.alessanderleite.boot.service;

import java.util.List;

import br.com.alessanderleite.boot.domain.Cargo;

public interface CargoService {

	void salvar(Cargo cargo);
	void editar(Cargo cargo);
	void excluir(Long id);
	Cargo buscarPorId(Long id);
	List<Cargo> buscarTodos();
}
