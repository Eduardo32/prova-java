package br.com.confidencecambio.javabasico.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EntidadeTest {

	private Entidade entidade;

    @BeforeEach
    public void init(){
    	entidade = new Entidade("João Soares Silva");
    }

	
	@Test
	public void validaNomeNulo() {
		boolean resposta = entidade.validaNome(null);
		assertEquals(false, resposta);
	}
	
	@Test
	public void validaNomeApenasComEspaco() {
		boolean resposta = entidade.validaNome("   ");
		assertEquals(false, resposta);
	}
	
	@Test
	public void validaNomeVazio() {
		boolean resposta = entidade.validaNome("");
		assertEquals(false, resposta);
	}
	
	@Test
	public void validaNome() {
		String nome = "João Soares Silva";
		boolean resposta = entidade.validaNome(nome);
		assertEquals(true, resposta);
	}
	
	@Test
	public void validaNomeSemEspaco() {
		String nome = "  João Soares Silva ";
		entidade.setNome(nome);
		String nomeSemEspaco = entidade.getNome();
		assertEquals("João Soares Silva", nomeSemEspaco);
	}

	@Test
	public void pegaPrimeiroNome() {
		String nome = "João Soares Silva";
		entidade.setNome(nome);
		String respostaEsperada = "João";
		String resposta = entidade.getPrimeiroNome();
		assertEquals(respostaEsperada, resposta);
	}
	
	@Test
	public void pegaUltimoNome() {
		String nome = "João Soares Silva";
		entidade.setNome(nome);
		String respostaEsperada = "Soares Silva";
		String resposta = entidade.getUltimoNome();
		assertEquals(respostaEsperada, resposta);
	}
	
	@Test
	public void pegaNomeAbreviado() {
		String nome = "João Soares Silva";
		entidade.setNome(nome);
		String respostaEsperada = "João S. Silva";
		String resposta = entidade.getNomeAbreviado();
		assertEquals(respostaEsperada, resposta);
	}
	
	@Test
	public void pegaEmMaiusculo() {
		String nome = "João Soares Silva";
		entidade.setNome(nome);
		String respostaEsperada = "JOÃO SOARES SILVA";
		String resposta = entidade.getNomeMaiusculo();
		assertEquals(respostaEsperada, resposta);
	}

}
