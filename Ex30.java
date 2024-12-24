import java.util.Scanner;

public class Ex30{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\nEscolha uma opcao:");
            System.out.println("1- Criptografar");
            System.out.println("2- Descriptografar");
            System.out.println("3- Sair");
            System.out.print("Opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    // Criptografar (ou Descriptografar, pois ROT-13 é simétrico)
                    System.out.print("Digite o texto para criptografar: ");
                    String textoPlano = scanner.nextLine();
                    String criptografado = rot13(textoPlano);
                    System.out.println("Texto criptografado: " + criptografado);
                    break;
                case 2:
                    // Descriptografar (mesmo processo de criptografar)
                    System.out.print("Digite a mensagem cifrada para descriptografar: ");
                    String textoCifrado = scanner.nextLine();
                    String descriptografado = rot13(textoCifrado);
                    System.out.println("Texto original: " + descriptografado);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida! Tente novamente.");
            }
        }
    }

    // Função que aplica ROT-13
    public static String rot13(String texto) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c >= 'a' && c <= 'z') {
                // Desloca as letras minúsculas
                c = (char) ('a' + (c - 'a' + 13) % 26);
            } else if (c >= 'A' && c <= 'Z') {
                // Desloca as letras maiúsculas
                c = (char) ('A' + (c - 'A' + 13) % 26);
            }
            resultado.append(c);
        }
        return resultado.toString();
    }
}
//Rafaela Campos Correa Santos
