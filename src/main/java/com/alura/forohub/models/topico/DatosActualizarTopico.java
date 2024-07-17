package com.alura.forohub.models.topico;

import com.alura.forohub.models.curso.DatosActualizarCurso;

public record DatosActualizarTopico(
        String titulo,
        String mensaje,
        DatosActualizarCurso curso) {

}
