package com.alura.forohub.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.alura.forohub.models.curso.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

    Page<Curso> findByActivoTrue(Pageable page);

    Optional<Curso> findByIdAndActivoTrue(Long id);

}
