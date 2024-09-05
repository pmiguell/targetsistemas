
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroBuscado;

        System.out.println("Digite o número a ser buscado na sequência de Fibonacci: ");
        numeroBuscado = scanner.nextInt();

        if (buscaNaSequenciaFibonacci(numeroBuscado)) {
            System.out.println("O número " + numeroBuscado + " pertence à sequência de Fibonacci!");
        } else {
            System.out.println("O número " + numeroBuscado + " não foi encontrado na sequência de Fibonacci! Tente outro.");
        }

        scanner.close();
    }

    public static boolean buscaNaSequenciaFibonacci(int numeroBuscado) {
        if (numeroBuscado < 0) {
            return false;
        }

        int elementoAnterior = 0;
        int elementoAtual = 1;

        while (elementoAnterior <= numeroBuscado) {
            if (elementoAnterior == numeroBuscado) {
                return true;
            }

            int proximoElemento = elementoAnterior + elementoAtual;
            elementoAnterior = elementoAtual;
            elementoAtual = proximoElemento;
        }

        return false;
    }
}