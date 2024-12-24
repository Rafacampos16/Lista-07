import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira frase:");
        String frase1 = scanner.nextLine();

        System.out.println("Digite a segunda frase:");
        String frase2 = scanner.nextLine();

        // Verifica se as frases têm o mesmo tamanho
        if (frase1.length() != frase2.length()) {
            System.out.println("As frases sao diferentes.");
        } else {
            // Realiza a comparação caractere por caractere
            boolean iguais = true;
            for (int i = 0; i < frase1.length(); i++) {
                if (frase1.charAt(i) != frase2.charAt(i)) {
                    iguais = false;
                }
            }

            if (iguais) {
                System.out.println("As frases sao iguais.");
            } else {
                System.out.println("As frases sao diferentes.");
            }
        }
    }
}
//Rafaela Campos Correa Santos
