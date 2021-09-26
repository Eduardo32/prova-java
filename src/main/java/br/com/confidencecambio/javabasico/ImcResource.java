package br.com.confidencecambio.javabasico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.confidencecambio.javabasico.service.ImcService;

@RestController
@RequestMapping(value = "/imc")
public class ImcResource {
	
	@Autowired
	private ImcService service;

	@RequestMapping(value = "/calcular", method = RequestMethod.GET)
	public ResponseEntity<String> imc(@RequestParam(value = "peso", required = true) double peso, @RequestParam(value = "altura", required = true) double altura) {
        var retorno = service.calculaIMC(peso, altura);
        return new ResponseEntity<>(retorno, HttpStatus.OK);
	}
}
