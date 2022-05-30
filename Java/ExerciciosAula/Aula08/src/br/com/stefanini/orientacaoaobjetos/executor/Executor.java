package br.com.stefanini.orientacaoaobjetos.executor;

import br.com.stefanini.orientacaoaobjetos.Carro;
import br.com.stefanini.orientacaoaobjetos.Mercedes;
import br.com.stefanini.orientacaoaobjetos.entidade.BMW;

public class Executor {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		carro1.setMarca("BMW");
		carro1.setModelo("320i");
		carro1.setChassi(9999);
		carro1.setPlaca("AAA9A99");
		carro1.setBancos(5);
		carro1.setRoda(20);
		carro1.setVelocidade(280);
		
		System.out.println(carro1.getMarca());
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getChassi());
		System.out.println(carro1.getPlaca());
		System.out.println(carro1.getBancos());
		System.out.println(carro1.getRoda());
		
		System.out.println(carro1.Acelerar());
		
		Carro carro2 = new Carro("Mercedes");
		
		carro2.setModelo("C180");
		carro2.setChassi(8888);
		carro2.setPlaca("BBB8B88");
		carro2.setBancos(5);
		carro2.setRoda(21);
		
		System.out.println(carro2.getMarca());
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getChassi());
		System.out.println(carro2.getPlaca());
		System.out.println(carro2.getBancos());
		System.out.println(carro2.getRoda());		
		
		System.out.println(soma(10, 5));
		System.out.println(soma(10, 15, 6));
		
		BMW bmw = new BMW();
		bmw.setVelocidade(100);
		System.out.println(bmw.Acelerar());
		
		Mercedes mercedes = new Mercedes();
		System.out.println(mercedes.Acelerar());

	}

	public static int soma(int a, int b) {
		return a + b;
	}

	public static int soma(int a, int b, int c) {
		return a + b + c;
	}
}