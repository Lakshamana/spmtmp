package br.ufpa.labes.spm.repository.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GenericRepository<T, PK> extends JpaRepository<T, PK>, BaseRepositoryQuery<T, PK> {}
