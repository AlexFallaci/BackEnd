package br.com.stefanini.orientacaoaobjetos.entidade;

import br.com.stefanini.orientacaoaobjetos.Carro;

public class Tesla extends Carro {
	
	private boolean dirigeSozinho;
	
	public Tesla() {
		super();
	}
	
	@Override
	public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
		System.out.println("Tesla Sobrescrita");
		return velocidadeFinal * tempoFinal;
	}

	public boolean isDirigeSozinho() {
		return dirigeSozinho;
	}

	public void setDirigeSozinho(boolean dirigeSozinho) {
		this.dirigeSozinho = dirigeSozinho;
	}

	@Override
	public void piscarAlerta() {
		System.out.println("Tesla piscando alerta...");
		
	}
	
	

}
