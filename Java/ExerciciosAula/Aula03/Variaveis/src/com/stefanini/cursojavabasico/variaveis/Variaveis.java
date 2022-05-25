package com.stefanini.cursojavabasico.variaveis;

public class Variaveis {

	public static void main(String[] args) {
		
		byte numByte = 127; // -128 a 127 (8bits) Nintendinho?
		short numShort = -32768; // -32768 a 32767 (16bits) Super Nintendo?
		int numInt = -2147483648; // -2.147.483.648 a 2.147.483.647 (32bits) PlayStation!PlayStation!PlayStation!
		long numLong = -9223372036854770000l; // -9.223.372.036.854.770.000 a 9.223.372.036.854.770.000 (64bits) Nintendo64!!!! Não esquecer do l para numeração maior que a do int
		
		float numFloat = 10.000f; // -1,4024E-37 a 3.40282347E+38 (32bits)
		double numDouble = 100000000000000.000; // -4,94E-307 a 1.79769313486231570E+308 (64bits)
		
		char varChar = 'F'; // 0 a 65535 (16bits)
		
		boolean varBoolean = false; //true or false (1bit) Atari ou pong?
		
		String texto = "Padawans!!";
		Integer numeroConta = 4000;
		Long numeroLongo = 5121212L;
		
//		Convenções
//		Letra minuscula Ex.: numeroConta
//		Não começar com caracter especial Ex.: _nome
//		Nome composto fazer como sempre Ex.: taCerto
//		Evitar variavel de 1 caractere (melhor tentar Lambda expression)
		
		String meuNome = "AlexSander";
		
	}

}