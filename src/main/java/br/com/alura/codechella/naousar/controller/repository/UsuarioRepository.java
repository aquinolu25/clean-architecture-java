package br.com.alura.codechella.naousar.controller.repository;

import br.com.alura.codechella.naousar.controller.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
