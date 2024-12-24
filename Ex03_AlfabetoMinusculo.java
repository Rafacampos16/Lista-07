/*
 * Ex03_AlfabetoMinusculo.java
 * 
 * Rafaela Campos Correa Santos
 * 
 */


public class Ex03_AlfabetoMinusculo {
	
	public static void main (String[] args) {
		
		String alfabeto = "";
		
		for (int i = 97; i <= 122; i++){
		
			alfabeto = alfabeto + (char)i + " ";
			
		}
		
		System.out.println(alfabeto);
		
		alfabeto = "";
		
		for (int i = 'a'; i <= 'z'; i++){
		
			alfabeto = alfabeto + (char)i + " ";
			
		}
		
		System.out.println(alfabeto);
		
		alfabeto = "";
		
		for (char i = 'a'; i <= 'z'; i++){
		
			alfabeto = alfabeto + i + " ";
			
		}
		
		System.out.println(alfabeto);
		
		alfabeto = "";
		
	}
}

