import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite uma palavra:");
        String palavra = leia.nextLine();

        // Remove espaços e converte para minúsculas (para evitar problemas com maiúsculas e minúsculas)
        palavra = palavra.replace(" ", "").toLowerCase();

        // Verifica se a palavra é um palíndromo
        boolean ehPalindromo = true;
        int tamanho = palavra.length();

        for (int i = 0; i < tamanho / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(tamanho - 1 - i)) {
                ehPalindromo = false;
            }
        }

        if (ehPalindromo) {
            System.out.println("A palavra \"" + palavra + "\" eh um palindromo.");
        } else {
            System.out.println("A palavra \"" + palavra + "\" nao eh um palindromo.");
        }

    }
}
//Rafaela Campos Correa Santos
