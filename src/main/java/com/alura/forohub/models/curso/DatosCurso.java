package com.alura.forohub.models.curso;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosCurso(
        @NotBlank
        @NotNull
        String nombre,
        @NotNull
        Categoria categoria) {

}
