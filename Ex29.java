import java.util.Scanner;

public class Ex29 {

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
                    // Criptografar
                    System.out.print("Digite o texto plano para criptografar: ");
                    String textoPlano = scanner.nextLine();
                    String criptografado = "";
                    for (int i = 0; i < textoPlano.length(); i++) {
                        char c = textoPlano.toUpperCase().charAt(i);
                        if (c == 'Z') criptografado += 'P';
                        else if (c == 'P') criptografado += 'Z';
                        else if (c == 'E') criptografado += 'O';
                        else if (c == 'O') criptografado += 'E';
                        else if (c == 'N') criptografado += 'L';
                        else if (c == 'L') criptografado += 'N';
                        else if (c == 'I') criptografado += 'A';
                        else if (c == 'A') criptografado += 'I';
                        else if (c == 'T') criptografado += 'R';
                        else if (c == 'R') criptografado += 'T';
                        else criptografado += c;
                    }
                    System.out.println("Texto criptografado: " + criptografado);
                    break;
                case 2:
                    // Descriptografar (simplesmente aplica a mesma lógica da criptografia)
                    System.out.print("Digite a mensagem cifrada para descriptografar: ");
                    String textoCifrado = scanner.nextLine();
                    String descriptografado = "";
                    for (int i = 0; i < textoCifrado.length(); i++) {
                        char c = textoCifrado.charAt(i);
                        if (c == 'Z') descriptografado += 'P';
                        else if (c == 'P') descriptografado += 'Z';
                        else if (c == 'E') descriptografado += 'O';
                        else if (c == 'O') descriptografado += 'E';
                        else if (c == 'N') descriptografado += 'L';
                        else if (c == 'L') descriptografado += 'N';
                        else if (c == 'I') descriptografado += 'A';
                        else if (c == 'A') descriptografado += 'I';
                        else if (c == 'T') descriptografado += 'R';
                        else if (c == 'R') descriptografado += 'T';
                        else descriptografado += c;
                    }
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
}
//Rafaela Campos Correa Santos
