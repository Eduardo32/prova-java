package br.com.confidencecambio.javabasico.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HelloServiceTest {

	private HelloService service;

    @BeforeEach
    public void init(){
         service = new HelloService();
    }

    @Test
    public void quandoPassarUmNomeQueroEleDeResposta(){
        var nome = "Meu Nome";
        String valorValido = service.retornaValorValido(nome);
        assertEquals(nome,valorValido);
    }

    @Test
    public void quandoPassarNuloQueroOPadrao(){
        String valorValido = service.retornaValorValido(null);
        assertEquals("Mundo",valorValido);
    }
}
