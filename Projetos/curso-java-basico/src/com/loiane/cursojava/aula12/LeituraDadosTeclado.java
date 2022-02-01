package com.loiane.cursojava.aula12;
import java.util.Scanner;
public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu primeiro nome, "
		+ "idade, quantos filhos, altura e se tem pet:");
		
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura = scan.nextFloat();
		boolean pet = scan.nextBoolean();
		
		System.out.println("Primeiro nome:" + primeiroNome + "\n" +
						   "Idade:" + idade + "\n" +
						   "Filhos:" + qtdFilhos + "\n" + 
						   "Altura:" + altura + "\n" + 
						   "Pet:" + pet);
	}

}
