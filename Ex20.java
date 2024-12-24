import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        // Solicita a frase ao usuário
        System.out.println("Digite uma frase:");
        String frase = leia.nextLine();

        // Remove espaços extras no início com o trim
        // \\s+ é uma expressão regular que encontra um ou mais espaços em branco consecutivos.
        // O método split() divide a frase em palavras com base nesses espaços.

        String[] palavras = frase.trim().split("\\s+");

        // Conta o número de palavras
        int numeroDePalavras = palavras.length;

        System.out.println("Numero de palavras na frase: " + numeroDePalavras);
    }
}
//Rafaela Campos Correa Santos
