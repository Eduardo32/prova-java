package br.com.confidencecambio.javabasico.service;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ImcServiceTest {

	private ImcService service;

    @BeforeEach
    public void init(){
         service = new ImcService();
    }

    @Test
    public void quandoCalcularImc(){
    	double altura = 1.75;
        double peso = 75.2;
        String imc = "24.56";
        String imcCalculado = service.calculaIMC(peso, altura);
	    assertEquals(imc, imcCalculado);
    }
}
