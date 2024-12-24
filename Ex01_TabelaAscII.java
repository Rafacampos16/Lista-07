/*
 * Ex01_TabelaAscII.java
 * 
 * Rafaela Campos Correa Santos
 * 
 */


public class Ex01_TabelaAscII {
	
	public static void main (String[] args) {
		
		for (int i = 0; i <= 255; i++){
		
			System.out.println(i + " - " + (char) i);
			
		}
		
		System.out.println();
		
		for (char i = 0; i <= 255; i++){
			
			//System.out.print(i + " " + (char) i + " - ");
			System.out.print(i + " - ");
			
		}
		
	}
}

