/*
 * Ex05_VerificarCaracterea.java
 * 
 * Rafaela Campos Correa Santos
 * 
 */

import java.util.Scanner;

public class Ex05_VerificarCaracterea {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		String frase = "";
		
		int contador = 0;
		
		System.out.print("Entre com uma frase: ");
		frase = leia.nextLine();
		
		System.out.println();
		
		for (int i = 0; i < frase.length(); i++){
			
			if (frase.charAt(i) == 'a') {
			
				contador++;
				
			}
			
		}
		
		System.out.println("Quantidade de caratere 'a': " + contador);
	}
}

