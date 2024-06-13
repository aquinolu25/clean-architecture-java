package br.com.alura.codechella.naousar.controller.service;

import br.com.alura.codechella.naousar.controller.model.Usuario;

import java.util.List;

public interface UsuarioService {
    Usuario cadastrarUsuario(Usuario usuario);

    List<Usuario> listarTodos();
}
