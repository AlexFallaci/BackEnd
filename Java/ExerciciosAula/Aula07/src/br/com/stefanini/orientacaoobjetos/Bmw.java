package br.com.stefanini.orientacaoobjetos;

public class Bmw extends Carro {

	@Override
	public int getAcelerar() {
			int aceleracao = 100 / 5;
		return aceleracao;
	}

	@Override
	public int getFrear() {
		int movimentacao = 0;
		return movimentacao;
	}

}
