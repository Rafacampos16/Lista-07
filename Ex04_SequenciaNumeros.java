/*
 * Ex04_SequenciaNumeros.java
 * 
 * Rafaela Campos Correa Santos
 * 
 */


public class Ex04_SequenciaNumeros {
	
	public static void main (String[] args) {
		
		String numeros = "";
		
		for (int i = 48; i <= 57; i++){
		
			numeros = numeros + (char)i + " ";
			
		}
		
		System.out.println(numeros);
		
		numeros = "";
		
		for (int i = '0'; i <= '9'; i++){
		
			numeros = numeros + (char)i + " ";
			
		}
		
		System.out.println(numeros);
		
		numeros = "";
		
		for (char i = '0'; i <= '9'; i++){
		
			numeros = numeros + i + " ";
			
		}
		
		System.out.println(numeros);
		
		numeros = "";
		
	}
}

