package com.alura.forohub.infra.mis_execpciones;

public class NoExiste extends Throwable {

    public NoExiste() {
        super();
    }

    public NoExiste(String mensaje) {
        super(mensaje);
    }

    public NoExiste(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
