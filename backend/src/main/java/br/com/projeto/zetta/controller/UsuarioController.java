package br.com.projeto.zetta.controller;

import br.com.projeto.zetta.auxiliar.UsuarioAuxiliar;
import br.com.projeto.zetta.models.Usuario;
import br.com.projeto.zetta.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @RequestMapping(value = "/usuario/listar", method = RequestMethod.GET)
    public List<Usuario> buscarTodos() {
        return service.findAll();
    }

    @RequestMapping(value = "/usuario/novo", method = RequestMethod.POST)
    public Usuario save(@RequestBody UsuarioAuxiliar novoUsuario) {
        return service.novoUsuario(novoUsuario);
    }
}
