package br.com.stefanini.vetores;

import java.lang.reflect.Array;

public class Vetores {

	public static void main(String[] args) {
		
		int [] notas = new int [10];
		notas[0] = 5;
		notas[3]= 9;
		
		int[][] matriz = new int [5][5];
		
		matriz[0][1] = 5;
		matriz[2][4] = 10;
		matriz[3][2] = 15;
		
//		System.out.println(matriz[0][1]);
//		System.out.println(matriz[2][4]);
//		System.out.println(matriz[3][2]);
		
		for(int[] m : matriz) {
			for(int v : m) {
				System.out.print(" " + v);
			}
			System.out.println();
		}
		
		
//		String[] meses = new String[] {"Janeiro", "Fevereiro","Março","Abril","Maio"};
//		
//		System.out.println(meses.length);
//		
//		for(String m : meses) {
//			System.out.println(m);
//		}
		
//		System.out.println(notas.length);
//		
//		for (int i = 0; i < notas.length; i++) {
//			System.out.println(notas[i]);
//		}
		
		
		
		
	}
}
