package br.com.alura.codechella;

import br.com.alura.codechella.domain.entities.usuario.Usuario;
import br.com.alura.codechella.infra.gateways.RepositorioDeUsuarioEmArquivo;

import java.time.LocalDate;

public class UtilizaUsuarioComArquivos {
    public static void main(String[] args) {

        RepositorioDeUsuarioEmArquivo repositorioDeUsuarioEmArquivo = new RepositorioDeUsuarioEmArquivo();

        repositorioDeUsuarioEmArquivo.cadastrarUsuario(new Usuario("444.222.333-22", "Luiz", LocalDate.parse("1997-10-30"), "luiz@gmail.com"));
        repositorioDeUsuarioEmArquivo.cadastrarUsuario(new Usuario("424.282.393-12", "Vinicius", LocalDate.parse("1994-07-30"), "vinicius@gmail.com"));
        repositorioDeUsuarioEmArquivo.cadastrarUsuario(new Usuario("143.127.432-11", "Ana", LocalDate.parse("1996-12-30"), "ana@gmail.com"));
        repositorioDeUsuarioEmArquivo.cadastrarUsuario(new Usuario("124.234.567-22", "Edgar", LocalDate.parse("1982-11-30"), "edgar@gmail.com"));

        repositorioDeUsuarioEmArquivo.gravaEmArquivo("usuarios.txt");
    }
}
