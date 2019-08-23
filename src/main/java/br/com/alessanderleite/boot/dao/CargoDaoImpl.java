package br.com.alessanderleite.boot.dao;

import org.springframework.stereotype.Repository;

import br.com.alessanderleite.boot.domain.Cargo;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao {

}
