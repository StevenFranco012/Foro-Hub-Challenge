package com.alura.forohub.DTO;

import com.alura.forohub.models.curso.Categoria;
import com.alura.forohub.models.curso.Curso;

public record DatosDTOCurso(String nombre,
        Categoria categoria) {

    public DatosDTOCurso(Curso curso) {
        this(curso.getNombre(), curso.getCategoria());
    }

}
