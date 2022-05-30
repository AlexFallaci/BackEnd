package br.com.stefanini.orientacaoobjetos;

public class Mercedes extends Carro{
	
			@Override
		public int getAcelerar() {
				int aceleracao = 100 / 3;
			return aceleracao;
		}

		@Override
		public int getFrear() {
			int movimentacao = 0;
			return movimentacao;
		}

	

}
