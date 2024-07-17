package com.alura.forohub.controller;

import com.alura.forohub.infra.mis_execpciones.NoExiste;
import com.alura.forohub.infra.mis_execpciones.ProblemasGenerarToken;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(NoExiste.class)
    public ResponseEntity<String> handleNoExiste(NoExiste e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }

    @ExceptionHandler(ProblemasGenerarToken.class)
    public ResponseEntity<String> handleProblemasGenerarToken(ProblemasGenerarToken e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }
}