import java.util.Scanner;
public class Ex10 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com uma frase: ");
		String frase = leia.nextLine();
		
		String alfabeto = " ";
		
		
		int contador = 0;
		for(char i = 'A'; i<= 'Z'; i++){
			
			for (int z = 0; z < frase.length(); z++){
				
				if(frase.charAt(z) == i){
						contador++;
					}
			}
			
		}
		
		System.out.println("Quantidade de letras maiusculas: " + contador);
		
	}
}
//Rafaela Campos Correa Santos
