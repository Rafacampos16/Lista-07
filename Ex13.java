import java.util.Scanner;
public class Ex13 {
	
		public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com uma frase: ");
		String frase = leia.nextLine();
		
		int contadorA = 0;
		int contadorE = 0;
		int contadorI = 0;
		int contadorO = 0;
		int contadorU = 0;
		int contadorCon = 0;
		int contadorSpa = 0;
		
		for (int z = 0; z < frase.length(); z++){
					if(frase.toUpperCase().charAt(z) == 'A'){
						contadorA++;
					}
					else if(frase.toUpperCase().charAt(z) == 'E'){
						contadorE++;
					}
					else if(frase.toUpperCase().charAt(z) == 'I'){
						contadorI++;
					}
					else if(frase.toUpperCase().charAt(z) == 'O'){
						contadorO++;
					}
					else if(frase.toUpperCase().charAt(z) == 'U'){
						contadorU++;
					}else if(frase.toUpperCase().charAt(z) == ' '){
						contadorSpa++;
					}else{
						contadorCon++;
					}
	}
	
	System.out.println("Quantidades de de consoantes: " + contadorCon);
	}
}


//Rafaela Campos Correa Santos
