import java.util.Scanner;

public class Ex28 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite uma string: ");
        String frase = leia.nextLine();

        int tamanho = frase.length();
        int meio = tamanho / 2;

        // Se o tamanho for ímpar, o meio vai ser arredondado para baixo
        // e a segunda metade vai ter um caractere a mais
        String primeiraMetade = frase.substring(0, meio);
        String segundaMetade = frase.substring(meio);

        // Variável para armazenar o resultado
        String resultado = "";

        // Concatenar as duas metades alternando os caracteres
        for (int i = 0; i < meio; i++) {
            resultado += primeiraMetade.charAt(i); // Adiciona da primeira metade
            resultado += segundaMetade.charAt(i);  // Adiciona da segunda metade
        }

        // Se a string tiver um número ímpar de caracteres, adicionar o último caractere da segunda metade
        if (tamanho % 2 != 0) {
            resultado += segundaMetade.charAt(meio);
        }

        System.out.println("Resultado: " + resultado);
    }
}
//Rafaela Campos Correa Santos
