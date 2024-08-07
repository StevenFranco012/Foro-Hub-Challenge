package com.alura.forohub.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.security.core.userdetails.UserDetails;

import com.alura.forohub.models.usuario.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    UserDetails findByEmail(String email);

    @Query("""
            SELECT u FROM Usuario u
            WHERE u.email = :email
            """)
    Optional<Usuario> cojerUsuarioPorEmail(String email);

    Optional<Usuario> findByIdAndActivoTrue(long id);
}
