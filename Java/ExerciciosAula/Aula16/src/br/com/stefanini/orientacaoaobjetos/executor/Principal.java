package br.com.stefanini.orientacaoaobjetos.executor;

import br.com.stefanini.orientacaoaobjetos.Carro;
import br.com.stefanini.orientacaoaobjetos.entidade.BMW;
import br.com.stefanini.orientacaoaobjetos.entidade.Tesla;

public class Principal {

	public static void main(String[] args) {
		
//		Carro bmw = new Carro();
//		bmw.setMarca("BMW");
//		bmw.setModelo("M3");
//		bmw.setQuilometrosPorLitro(7.5);
//		bmw.taxaAceleracao = 50;
//		bmw.setVelocidadeMaxima(280);
//						
//		System.out.println(bmw.getMarca());
//		System.out.println(bmw.getModelo());
//		System.out.println(bmw.getQuilometrosPorLitro());
//		System.out.println(bmw.getTaxaAceleracao());
//		System.out.println(bmw.getVelocidadeMaxima());
		
//		bmw.acelerar();
//		bmw.frear();
		
//		System.out.println(bmw.calcularTaxaAceleracao(bmw.getVelocidadeMaxima(), 0, 10, 0));		
//		System.out.println(bmw.calcularTaxaAceleracao(bmw.getVelocidadeMaxima(),5));
//		System.out.println(bmw.calcularTaxaAceleracao(100,5));

//		Carro mercedes = new Carro("Mercedes", "c180");
		
//		System.out.println(mercedes.getMarca());
//		System.out.println(mercedes.getModelo());
		
		BMW bmwDois = new BMW();
//		System.out.println(bmwDois.calcularTaxaAceleracao(100.5, 10.5));
		
		bmwDois.piscarAlerta();
		
		Tesla tesla = new Tesla();
		tesla.isDirigeSozinho();
					
		Carro teslaDois = new Tesla();
		((Tesla) teslaDois).setDirigeSozinho(true);
		System.out.println(((Tesla) teslaDois).isDirigeSozinho());
		teslaDois.piscarAlerta();
		
		Carro[] carros = new Carro[] {bmwDois, tesla, teslaDois};
		
		for (Carro carro : carros) {
			if (carro instanceof Tesla) {
				System.out.println(((Tesla) carro).isDirigeSozinho());
			}
		}
		
		bmwDois.calcularTaxaAceleracao(100.50, 10);
		tesla.calcularTaxaAceleracao(100.50, 10);
	}

}
