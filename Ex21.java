import java.util.Scanner;
public class Ex21 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com uma frase: ");
		String frase = leia.nextLine();
		
		String[] palavras = frase.split(" ");
		
		int numeroDePalavras = palavras.length;
		
		for(int i = 0; i < numeroDePalavras ; i++){
			System.out.println("Palavra " + (i + 1) + ": "+ palavras[i]);
		}
	}
}

//Escreva um programa que receba uma frase, imprima cada palavras desta frase em uma linha.
//Rafaela Campos Correa Santos
