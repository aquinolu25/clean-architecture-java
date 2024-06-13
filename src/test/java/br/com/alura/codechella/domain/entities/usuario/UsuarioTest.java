package br.com.alura.codechella.domain.entities.usuario;

import br.com.alura.codechella.domain.Endereco;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class UsuarioTest {
    @Test
    public void naoDeveCadastrarUsuarioComCpfNoFormatoInvalido() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Usuario("123456789-99", "Luiz Aquino", LocalDate.parse("1997-10-30"), "luiz@gmail.com"));

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Usuario("12345678999", "Luiz Aquino", LocalDate.parse("1997-10-30"), "luiz@gmail.com"));

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Usuario("", "Luiz Aquino", LocalDate.parse("1997-10-30"), "luiz@gmail.com"));
    }

    @Test
    public void deveCriarUsuarioUsandoFrabricaDeUsuario() {
        FabricaDeUsuario fabrica = new FabricaDeUsuario();
        Usuario usuario = fabrica.comNomeCpfNascimento("Ana","444.222.111-00", LocalDate.parse("2000-11-24"));
        Assertions.assertEquals("Ana", usuario.getNome());

        usuario = fabrica.incluiEndereco("12345-666", 44, "apto 21");
        Assertions.assertEquals("apto 21", usuario.getEndereco().getComplemento());

    }

    @Test
    public void naoDeveCadastrarUsuarioComMenosDe18Anos() {
        LocalDate dataDeNascimento = LocalDate.now().minusYears(17);

        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> {new Usuario("123.456.789-00", "Fulano", dataDeNascimento, "fulano@example.com");
        });

        Assertions.assertEquals("Usuário deve ter no mínimo 18 anos de idade!", exception.getMessage());
    }


}
