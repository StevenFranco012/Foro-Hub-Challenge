package com.alura.forohub.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alura.forohub.models.topico.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

    Page<Topico> findByStatusTrue(Pageable page);

    Optional<Topico> findByIdAndStatusTrue(long id);
}
