package br.com.stefanini.orientacaoaobjetos.entidade;

import br.com.stefanini.orientacaoaobjetos.Carro;

public class Mercedes extends Carro{
	
	public Mercedes() {
		this.setMarca("Mercedes");
	}

	@Override
	public void piscarAlerta() {
		System.out.println("Mercedes piscando alerta...");
		
	}
	
	

}
