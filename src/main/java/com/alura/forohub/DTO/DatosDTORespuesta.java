package com.alura.forohub.DTO;

import java.time.LocalDateTime;

import com.alura.forohub.models.respuesta.Respuesta;

public record DatosDTORespuesta(
        String mensaje,
        //DatosDTOTopico topico,
        LocalDateTime fecha,
        DatosDTOUsuario autor,
        String solucion) {

    public DatosDTORespuesta(Respuesta r) {
        this(r.getMensaje()/*, new DatosDTOTopico(r.getTopico())*/, r.getFecha(), new DatosDTOUsuario(r.getAutor()),
                r.getSolucion());
    }

}
