//Rafaela Campos Correa Santos
import java.util.Scanner;
public class Ex08 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com uma frase: ");
		String frase = leia.nextLine();
		
		String alfabeto = " ";
		
		for(char i = 'A'; i<= 'Z'; i++){
			int contador = 0;
	
				
			for (int z = 0; z < frase.length(); z++){
				
				if(frase.toUpperCase().charAt(z) == i){
						contador++;
					}
			}
			
			if(contador !=0){
				System.out.println(i + " " + contador);
			}
			
		}
	
	 
	}
}

