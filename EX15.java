import java.util.Scanner;
public class EX15 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com uma frase: ");
		String frase = leia.nextLine();
		
		String alfabeto = " ";
		
		int contador = 0;
		
		for(char i = '0'; i<= '9'; i++){	
		  				
			for (int z = 0; z < frase.length(); z++){
				
				if(frase.charAt(z) == i){
						contador++;
					}
			}
		}
		
		if(contador >= 1){
			System.out.println("Essa frase possui caracteres numericos!!");
		}else{
			System.out.println("Essa frase nao possui caracteres numericos!!");
		}
		
	}
}

//Rafaela Campos Correa Santos
