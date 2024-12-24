import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sequência de 0's e 1's:");
        String sequencia = scanner.nextLine();

        // Variáveis para armazenar o tamanho da maior sequência e a sequência atual
        int maiorSequencia = 0;
        int sequenciaAtual = 0;

        // Percorre cada caractere da sequência
        for (int i = 0; i < sequencia.length(); i++) {
            if (sequencia.charAt(i) == '1') {
                sequenciaAtual++;  // Incrementa a sequência de 1's
            } else {
                // Se encontrar um 0, compara e reseta a sequência atual
                if (sequenciaAtual > maiorSequencia) {
                    maiorSequencia = sequenciaAtual;
                }
                sequenciaAtual = 0;  // Reseta a sequência
            }
        }

      
        if (sequenciaAtual > maiorSequencia) {
            maiorSequencia = sequenciaAtual;
        }

        System.out.println("A maior sequência de 1's tem tamanho: " + maiorSequencia);

    }
}
//Rafaela Campos Correa Santos
