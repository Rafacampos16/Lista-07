import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine().toLowerCase();

        System.out.println("Digite a palavra que deseja contar:");
        String palavra = scanner.nextLine().toLowerCase();
        
        int contador = 0;

        // Verifica todas as ocorrências, usando  método substring() da String
        for (int i = 0; i <= frase.length() - palavra.length(); i++) {
            if (frase.substring(i, i + palavra.length()).equals(palavra)) {
                contador++;
            }
        }

        System.out.println("A palavra \"" + palavra + "\" ocorre " + contador + " vez(es) na frase.");

        scanner.close();
    }
}
//Rafaela Campos Correa Santos
