/*
 * Ex06_VerificarCaractereX.java
 * 
 * Rafaela Campos Correa Santos
 * 
 */

import java.util.Scanner;

public class Ex06_VerificarCaractereX {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		String caractere = "";
		
		String frase = "";
		
		int contador = 0;
		
		System.out.print("Entre com o caractere que deseja contar: ");
		caractere = leia.nextLine();
		
		System.out.print("Entre com uma frase: ");
		frase = leia.nextLine();
		
		System.out.println();
		
		for (int i = 0; i < frase.length(); i++){
			
			if (frase.charAt(i) == caractere.charAt(0)) {
			
				contador++;
				
			}
			
		}
		
		System.out.println("Caratere escolhido: " + caractere);
		System.out.println("Quantidade de caratere: " + contador);
	}
}

