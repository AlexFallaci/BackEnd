package br.com.stefanini.orientacaoaobjetos.entidade;

import br.com.stefanini.orientacaoaobjetos.Carro;
import br.com.stefanini.orientacaoaobjetos.Conversivel;
import br.com.stefanini.orientacaoaobjetos.Utilitario;

public class BMW extends Carro implements Conversivel, Utilitario{
	
	public BMW() {
		super();
	}
	
	@Override
	public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
		System.out.println("BMW Sobrescrita");
		return velocidadeFinal/tempoFinal;
	}

	@Override
	public void piscarAlerta() {
		System.out.println("BMW piscando alerta...");
		
	}

	@Override
	public void acionarTurbo() {
		System.out.println("Acionando turbo...");
		
	}

	@Override
	public void passear() {
		System.out.println("Passeando...");
		
	}

	@Override
	public void abrirCapo() {
		// TODO Auto-generated method stub
		
	}

}
