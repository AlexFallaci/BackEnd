package br.com.stefanini.estruturasdecontrole;

public class For {

	public static void main(String[] args) {
		
		//for normal
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		//for apenas com a condi��o
		int i = 0;
		
		for(;i < 10;) {
			System.out.println(i);
			i++;
		}
		//for looping infinito
//		for (;;) {
//			System.out.println("Looping infinito");
//		}

	}

}
