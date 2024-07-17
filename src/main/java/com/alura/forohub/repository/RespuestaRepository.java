package com.alura.forohub.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.alura.forohub.models.respuesta.Respuesta;

public interface RespuestaRepository extends JpaRepository<Respuesta, Long> {

    Page<Respuesta> findByActivoTrue(Pageable page);

    Optional<Respuesta> findByIdAndActivoTrue(long id);
}
