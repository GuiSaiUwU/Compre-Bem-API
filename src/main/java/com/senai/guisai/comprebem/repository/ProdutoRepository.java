package com.senai.guisai.comprebem.repository;

import com.senai.guisai.comprebem.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, UUID> {

    Page<Produto> findByNomeContainingIgnoreCaseOrDescricaoContainingIgnoreCase(String nome, String descricao, Pageable pageable);
}
