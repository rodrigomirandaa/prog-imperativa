import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][4];

        System.out.println("Digite os elementos da matriz: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento na posicao [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Agora a matriz esta preenchida manualmente pelo usuario
        System.out.println("Matriz inserida:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Calculando a soma das linhas e imprimindo
        for (int i = 0; i < 3; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 4; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.println("Soma dos elementos da linha " + i + " e: " + somaLinha);
        }

        // Calculando a soma das colunas e imprimindo
        for (int j = 0; j < 4; j++) {
            int somaColuna = 0;
            for (int i = 0; i < 3; i++) {
                somaColuna += matriz[i][j];
            }
            System.out.println("Soma dos elementos da coluna " + j + " e: " + somaColuna);
        }
    }
}
