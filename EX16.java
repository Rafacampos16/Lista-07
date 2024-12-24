import java.util.Scanner;
public class EX16 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com uma frase: ");
		String frase = leia.nextLine();
		
		int contador = 0;
		
		for(char i = 'a'; i<= 'z'; i++){	
		  				
			for (int z = 0; z < frase.length(); z++){
				
				if(frase.charAt(z) == i){
						contador++;
					}
			}
		}
	
		if (contador >= 1){
			System.out.println("Essa frase nao possui apenas caracteres mauisculos!!");
		}else{
			System.out.println("Essa frase possui apenas caracteres mauisculos!!");
		}
	 
	}
}

//Rafaela Campos Correa Santos
