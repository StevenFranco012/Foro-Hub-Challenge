package com.alura.forohub.infra.mis_execpciones;

public class TokenInvalido extends Throwable {

    public TokenInvalido() {
        super();
    }

    public TokenInvalido(String mensaje) {
        super(mensaje);
    }

    public TokenInvalido(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
