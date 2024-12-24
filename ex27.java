import java.util.Scanner;

public class ex27 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Entre com a primeira palavra: ");
        String palavra1 = leia.nextLine();

        System.out.println("Entre com a segunda palavra: ");
        String palavra2 = leia.nextLine();

        if (palavra1.length() != palavra2.length()) {
            System.out.println("As palavras têm tamanhos diferentes!");
        } else {
            // Define o comprimento máximo entre as duas palavras
            int tamanhoMax = Math.max(palavra1.length(), palavra2.length());

            // String para armazenar o resultado
            String resultado = "";

            // Intercala as letras das duas palavras
            for (int i = 0; i < tamanhoMax; i++) {
                if (i < palavra1.length()) {
                    resultado += palavra1.charAt(i); // Adiciona a letra da palavra1
                }
                if (i < palavra2.length()) {
                    resultado += palavra2.charAt(i); // Adiciona a letra da palavra2
                }
            }

            // Imprime o resultado final
            System.out.println("Resultado: " + resultado);
        }
    }
}
//Rafaela Campos Correa Santos

