import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome completo:");
        String nomeCompleto = scanner.nextLine();

        // Divide o nome completo em palavras usando o metodo subString
        String[] partesNome = nomeCompleto.split(" ");

        String sobrenome = partesNome[partesNome.length - 1];

        System.out.println("Sobrenome: " + sobrenome);

        scanner.close();
    }
}
//Rafaela Campos Correa Santos
