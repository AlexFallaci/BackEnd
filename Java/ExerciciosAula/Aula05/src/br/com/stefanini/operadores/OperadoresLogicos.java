package br.com.stefanini.operadores;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		/**
		 * 
		 * And 
		 * V and F = F
		 * V and V = V
		 * F and V = F
		 * F and F = F
		 * 
		 * OR
		 * V or F = V
		 * V or V = V
		 * F or V = V
		 * F or F = F
		 * 
		 * XOR
		 * V xor F = V
		 * V xor V = F
		 * F xor V = V
		 * F xor F = F
		 * 
		 * Nega��o L�gica
		 * !V = F
		 * !F = V
		 */
		
		boolean v = true;
		boolean f = false;
		
		//and && padr�o; testa cada ou & testa todas
		
//		System.out.println(v && f);
//		System.out.println(v && v);
//		System.out.println(f && v);
//		System.out.println(f && f);
		
		// or || padr�o ;testa cada ou | testa todas
		
//		System.out.println(v || f);
//		System.out.println(v || v);
//		System.out.println(f || v);
//		System.out.println(f || f);
		
		// xor !=
		
//		System.out.println(v != f);
//		System.out.println(v != v);
//		System.out.println(f != v);
//		System.out.println(f != f);
		
		// Nega��o l�gica !
		
		System.out.println(! f);
		System.out.println(! v);
		

	}

}
