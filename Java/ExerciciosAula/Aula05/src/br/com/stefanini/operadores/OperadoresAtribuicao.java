package br.com.stefanini.operadores;

public class OperadoresAtribuicao {
	
	public static void main(String[] args) {
		
		int a = 11;// = operador de atribui��o
		int b = 5;
		
		b += a; // += aditivo
//		b = b + a;
		b -= a;// subtrativo
//		b = b - a;
		b *= a;// multiplicativo
//		b = b * a;
		b /= a;// divisivo
//		b = b / a;
		b %= a;// modular (resto divis�o)
//		b = b % a;
		
		System.out.println(a % b);
	}

}
