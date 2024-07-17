package com.alura.forohub.infra.mis_execpciones;

public class ProblemasGenerarToken extends Throwable {

    public ProblemasGenerarToken() {
        super();
    }

    public ProblemasGenerarToken(String mensaje) {
        super(mensaje);
    }

    public ProblemasGenerarToken(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
