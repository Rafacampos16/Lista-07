import java.util.Scanner;
public class EX12 {
	
		public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com uma frase: ");
		String frase = leia.nextLine();
		
		int contadorA = 0;
		int contadorE = 0;
		int contadorI = 0;
		int contadorO = 0;
		int contadorU = 0;
		
		for (int z = 0; z < frase.length(); z++){
					if(frase.toUpperCase().charAt(z) == 'A'){
						contadorA++;
					}
					if(frase.toUpperCase().charAt(z) == 'E'){
						contadorE++;
					}
					if(frase.toUpperCase().charAt(z) == 'I'){
						contadorI++;
					}
					if(frase.toUpperCase().charAt(z) == 'O'){
						contadorO++;
					}
					if(frase.toUpperCase().charAt(z) == 'U'){
						contadorU++;
					}
	}
	
	System.out.println("Quantidades de A: " + contadorA);
	System.out.println("Quantidades de E: " + contadorE);
	System.out.println("Quantidades de I: " + contadorI);
	System.out.println("Quantidades de O: " + contadorO);
	System.out.println("Quantidades de U: " + contadorU);
	}
}

//Rafaela Campos Correa Santos

