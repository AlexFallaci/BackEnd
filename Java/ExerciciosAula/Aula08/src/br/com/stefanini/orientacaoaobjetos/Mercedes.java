package br.com.stefanini.orientacaoaobjetos;

public class Mercedes extends Carro{
	
	public Mercedes() {
		this.setMarca("Mercedes");
	}
	
	@Override
	public String Acelerar() {
		return "A Mercedes tem uma acelera��o diferente para cada modelo";
	}

}
