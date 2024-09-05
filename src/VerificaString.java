import java.util.Scanner;

public class VerificaString {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite uma frase: ");
            String frase = scanner.nextLine();

            int ocorrencias = contarOcorrenciasDeA(frase);

            if (ocorrencias > 0) {
                System.out.println("Os caracteres 'a' e/ou 'A' foram encontrados " + ocorrencias + " vezes na frase!");
            } else {
                System.out.println("Os caracteres 'a' ou 'A' não foram encontrados na frase!");
            }
        }
    }

    public static int contarOcorrenciasDeA(String frase) {
        frase = frase.toLowerCase();
        int contador = 0;

        for (char caractere : frase.toCharArray()) {
            if (caractere == 'a') {
                contador++;
            }
        }

        return contador;
    }
}

