package com.alura.forohub.DTO;

import com.alura.forohub.models.usuario.Usuario;

public record DatosDTOUsuario(String nombre,
        String email) {

    public DatosDTOUsuario(Usuario autor) {
        this(autor.getNombre(), autor.getEmail());
    }

}
