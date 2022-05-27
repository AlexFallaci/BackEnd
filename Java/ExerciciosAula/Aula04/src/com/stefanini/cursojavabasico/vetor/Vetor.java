package com.stefanini.cursojavabasico.vetor;

public class Vetor {

	public static void main(String[] args) {
		
		int[] notas = new int [10];
		
		notas[0] = 1;
		notas[2] = 5;
		notas[6] = 9;
		notas[4] = 2;
		notas[1] = 4;
		notas[9] = 7;
		notas[7] = 8;
		
//		System.out.println(notas[0]);
//		System.out.println(notas[2]);
//		System.out.println(notas[6]);
//		System.out.println(notas[4]);
//		System.out.println(notas[1]);
//		System.out.println(notas[9]);
//		System.out.println(notas[7]);
		
		String[] carros = new String[] {"BMW i320", "Mercedes c180", "BMW M3", "Mercedes AMG", "Tesla Model S"};
		
		System.out.println(carros.length);
		
		for (String carro : carros) {
			System.out.println(carro);
		}
		
//		for (int i =0; i < notas.length; i ++) {
//			System.out.println(notas[i]);
//		}
		
//		Matriz
		String [][] carro = new String[2][3];
		
		carro [0] [0] = "Fusca";
		carro [0] [1] = "1963";
		carro [1] [0] = "Fusca";
		carro [1] [1] = "1973";
		
		for (int i = 0; i < carro.length; i++) {
			for (int j = 0; j < carro.length; j++) {
				System.out.print(carro[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
