import java.util.Scanner;
public class Ex09 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com uma frase: ");
		String frase = leia.nextLine();
		
		int contador = 0;
		for (int z = 0; z < frase.length(); z++){
			if(frase.toUpperCase().charAt(z) == ' '){
						contador++;
					}
	}
	
	System.out.println("Quantidades de espacos na frase: " + contador);
	}
}
//Rafaela Campos Correa Santos
