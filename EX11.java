import java.util.Scanner;
public class EX11 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com uma frase: ");
		String frase = leia.nextLine();
		
		String alfabeto = " ";
		
		int contador = 0;
		int contador2 = 0;
		
		for(char i = 'A'; i<= 'Z'; i++){	
		  				
			for (int z = 0; z < frase.length(); z++){
				
				if(frase.toUpperCase().charAt(z) == i){
						contador++;
					}
			}
		}
	
		for(char k = '0'; k<= '9'; k++){	
		  				
			for (int l = 0; l < frase.length(); l++){
				
				if(frase.charAt(l) == k){
						contador2++;
					}
			}
		}
	 
	 System.out.println("Quantidade de caracteres alfabeticos: " + contador);
			System.out.println("Quantidades de digitos numericos: " + contador2);
	}
}

//Rafaela Campos Correa Santos
