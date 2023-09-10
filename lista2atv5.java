import java.util.Scanner;
import java.util.Arrays;

class Main {
    // funcao Bubble Sort para ordenar o vetor
    public static void bubbleSort(int[] vetor) {
        boolean trocou;
        do {
            trocou = false;
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    // Troca os elementos
                    int temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    trocou = true;
                }
            }
        } while (trocou);
        System.out.print(Arrays.toString(vetor));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int vetor[] = new int[5];

        for(int i = 0; i<5; i++){
            System.out.print("Digite o valor "+ (i+1) + " do vetor : \n");
            vetor[i] = scanner.nextInt();
        }
        
        bubbleSort(vetor);
    }
}
