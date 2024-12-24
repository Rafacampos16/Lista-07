import java.util.Scanner;

public class EX14 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String frase = leia.nextLine();

        System.out.println("Digite o caractere a ser substituido:");
        char caractere = leia.next().charAt(0);

        // Substitui todas as ocorrências do caractere por asterisco
        String fraseModificada = frase.replace(caractere, '*');

        System.out.println("Frase modificada:");
        System.out.println(fraseModificada);

    }
}
//Rafaela Campos Correa Santos
