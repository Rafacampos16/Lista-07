import java.util.Scanner;
public class Ex18 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Entre com uma cadeia de caracteres: ");
		String cadeia = leia.nextLine();
		
		int contador = 0;
		
		for(char i = '0'; i<= '1'; i++){	
		  				
			for (int z = 0; z < cadeia.length(); z++){
				
				if(cadeia.toUpperCase().charAt(z) == i){
						contador++;
					}
			}
		}
	
		if(contador < 8 || contador > 8){
				System.out.println("Nao eh um sequencia binaria de 8 bits");
			}else{
				System.out.println("Eh um sequencia binaria de 8 bits");
			}
	}
}
//Rafaela Campos Correa Santos
