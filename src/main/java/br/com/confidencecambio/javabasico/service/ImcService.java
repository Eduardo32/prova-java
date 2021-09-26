package br.com.confidencecambio.javabasico.service;

import java.text.DecimalFormat;

import org.springframework.stereotype.Service;

@Service
public class ImcService {

	public String calculaIMC(double peso, double altura) {
		DecimalFormat df = new DecimalFormat("#.##");
		return df.format(peso / Math.pow(altura, 2)).replace(",", ".");
	}
}
