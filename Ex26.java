import java.util.Random;

public class Ex26 {

    public static void main(String[] args) {
        // Gerar uma String aleatória com 100 letras minúsculas
        String alfabeto = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 40; i++) {
            int indice = random.nextInt(alfabeto.length());
            sb.append(alfabeto.charAt(indice));
        }

        String frase = sb.toString();
        System.out.println("Sequencia gerada: " + frase);

        // 1. Letras que não estão na sequência
        System.out.print("Letras nao presentes na sequencia: ");
        for (char c = 'a'; c <= 'z'; c++) {
            if (!frase.contains(String.valueOf(c))) {
                System.out.print(c + " ");
            }
        }
        System.out.println();

        // 2. Maior sequência de letras repetidas
        int maxRepetidas = 1;
        int countRepetidas = 1;
        for (int i = 1; i < frase.length(); i++) {
            if (frase.charAt(i) == frase.charAt(i - 1)) {
                countRepetidas++;
                maxRepetidas = Math.max(maxRepetidas, countRepetidas);
            } else {
                countRepetidas = 1;
            }
        }
        System.out.println("Maior sequencia de letras repetidas: " + maxRepetidas);

        // 3. Maior sequência de vogais
        String vogais = "aeiou";
        int maxVogais = 0;
        int countVogais = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (vogais.indexOf(frase.charAt(i)) != -1) {
                countVogais++;
                maxVogais = Math.max(maxVogais, countVogais);
            } else {
                countVogais = 0;
            }
        }
        System.out.println("Maior sequencia de vogais: " + maxVogais);
        // 4. Maior sequência alfabética
        int maxAlfabetica = 1;
        int countAlfabetica = 1;
        for (int i = 1; i < frase.length(); i++) {
            if (frase.charAt(i) == frase.charAt(i - 1) + 1) {
                countAlfabetica++;
                maxAlfabetica = Math.max(maxAlfabetica, countAlfabetica);
            } else {
                countAlfabetica = 1;
            }
        }
        System.out.println("Maior sequencia alfabetica: " + maxAlfabetica);
    }
}
//Rafaela Campos Correa Santos
