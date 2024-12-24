import java.util.Scanner;
public class Ex25 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com uma senha forte: ");
		String senha = leia.nextLine();
	
		
		int contadorMai = 0;
		int contadorMin = 0;
		int contadorNum = 0;
		int contadorSim = 0;
		
		for(char i = 'A'; i<= 'Z'; i++){	
		  				
			for (int z = 0; z < senha.length(); z++){
				
				if(senha.charAt(z) == i){
						contadorMai++;
					
					}
			}
		}
		
		for(char j = 'a'; j<= 'z'; j++){	
		  				
			for (int y = 0; y < senha.length(); y++){
				
				if(senha.charAt(y) == j){
						contadorMin++;
					
					}
			}
		}
		
		for(char k = '0'; k<= '9'; k++){	
		  				
			for (int w = 0; w < senha.length(); w++){
				
				if(senha.charAt(w) == k){
						contadorNum++;
						
					}
			}
		}
		
		for(char k = '0'; k<= '9'; k++){	
		  				
			for (int w = 0; w < senha.length(); w++){
				
				if(senha.charAt(w) == k){
						contadorNum++;
						
					}
			}
		}
		
		for(char l = 33; l<= 38; l++){	
		  				
			for (int m = 0; m < senha.length(); m++){
				
				if(senha.charAt(m) == l){
						contadorSim++;
						
					}
			}
		}
		
		for(char n = 60; n<= 64; n++){	
		  				
			for (int o = 0; o < senha.length(); o++){
				
				if(senha.charAt(o) == n){
						contadorSim++;
					
					}
			}
		}
		
		
		if (contadorMai < 2){
			System.out.println("Essa senha precisa de 2 carcteres Maisculos!!");
		}if(contadorMin < 2){
			System.out.println("Essa senha precisa de 2 carcteres Minusculos!!");
		}if(contadorNum < 2){
			System.out.println("Essa senha precisa de 2 carcteres Numericos!!");
		}if(contadorSim < 1){
			System.out.println("Essa senha precisa de 1 Simbolos!!");
		}if(senha.length() < 10){
			System.out.println("Essa senha precisa de 10 caracteres!!");
		}if (contadorMai >= 2 && contadorMin >= 2 && contadorNum >= 2 && contadorSim >= 1 && senha.length() >= 10) {
            System.out.println("Senha criada!!");
        }
	
	}
}

//Rafaela Campos Correa Santos
