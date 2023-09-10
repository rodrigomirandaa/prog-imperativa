import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do primeiro vetor: ");
        int tamanho1 = scanner.nextInt();

        int[] vetor1 = new int[tamanho1];
        System.out.println("Digite os elementos do primeiro vetor em ordem crescente:");
        for (int i = 0; i < tamanho1; i++) {
            vetor1[i] = scanner.nextInt();
        }

        System.out.print("Digite o tamanho do segundo vetor: ");
        int tamanho2 = scanner.nextInt();

        int[] vetor2 = new int[tamanho2];
        System.out.println("Digite os elementos do segundo vetor em ordem crescente:");
        for (int i = 0; i < tamanho2; i++) {
            vetor2[i] = scanner.nextInt();
        }

        int[] vetorUniao = new int[tamanho1 + tamanho2];
        int i = 0, j = 0, k = 0;

        while (i < tamanho1 && j < tamanho2) {
            if (vetor1[i] < vetor2[j]) {
                vetorUniao[k++] = vetor1[i++];
            } else {
                vetorUniao[k++] = vetor2[j++];
            }
        }

        while (i < tamanho1) {
            vetorUniao[k++] = vetor1[i++];
        }

        while (j < tamanho2) {
            vetorUniao[k++] = vetor2[j++];
        }

        System.out.println("Vetor de uniao: " + Arrays.toString(vetorUniao));
    }
}
