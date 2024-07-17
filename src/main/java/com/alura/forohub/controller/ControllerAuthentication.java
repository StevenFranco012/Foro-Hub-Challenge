package com.alura.forohub.controller;

import com.alura.forohub.DTO.DatosDTOUsuario;
import com.alura.forohub.infra.mis_execpciones.NoExiste;
import com.alura.forohub.infra.mis_execpciones.ProblemasGenerarToken;
import com.alura.forohub.models.DatosToken;
import com.alura.forohub.models.usuario.DatosUsuario;
import com.alura.forohub.models.usuario.Login;
import com.alura.forohub.models.usuario.Usuario;
import com.alura.forohub.service.ServiceToken;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/login")
public class ControllerAuthentication {
    private final ServiceToken service;
    private final AuthenticationManager manager;

    public ControllerAuthentication(ServiceToken service, AuthenticationManager manager) {
        this.service = service;
        this.manager = manager;
    }

    @PostMapping
    public ResponseEntity<DatosToken> autenticarUsuario(@RequestBody @Valid Login usuario) {
        Authentication authToken = new UsernamePasswordAuthenticationToken(usuario.email(), usuario.contrasena());
        var usuarioAutenticado = manager.authenticate(authToken);
        var JWTtoken = service.generarToken((Usuario) usuarioAutenticado.getPrincipal());
        return ResponseEntity.ok(new DatosToken(JWTtoken));
    }

    @PostMapping("/registrar")
    public ResponseEntity<DatosDTOUsuario> registrarUsuario(@RequestBody @Valid DatosUsuario usuario) {
        var nuevoUsuario = service.registrarUsuario(usuario);
        return ResponseEntity.ok(nuevoUsuario);
    }
}