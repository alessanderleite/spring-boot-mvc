package br.com.alessanderleite.boot.dao;

import org.springframework.stereotype.Repository;

import br.com.alessanderleite.boot.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

}
