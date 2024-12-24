/*
 * Ex02_AlfabetoMaiusculo.java
 * 
 * Rafaela Campos Correa Santos
 * 
 */


public class Ex02_AlfabetoMaiusculo {
	
	public static void main (String[] args) {
		
		String alfabeto = "";
		
		for (int i = 65; i <= 90; i++){
		
			alfabeto = alfabeto + (char)i + " ";
			
		}
		
		System.out.println(alfabeto);
		
		alfabeto = "";
		
		for (int i = 'A'; i <= 'Z'; i++){
		
			alfabeto = alfabeto + (char)i + " ";
			
		}
		
		System.out.println(alfabeto);
		
		alfabeto = "";
		
		for (char i = 'A'; i <= 'Z'; i++){
		
			alfabeto = alfabeto + i + " ";
			
		}
		
		System.out.println(alfabeto);
		
		alfabeto = "";
		
	}
}

