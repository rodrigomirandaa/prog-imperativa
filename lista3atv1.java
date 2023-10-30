import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[2][2];
        int[][] matrizr = new int[2][2];
        int maior = 0;
    
        System.out.println("Digite os elementos da matriz: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemento na posicao [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                
                if(matriz[i][j]>maior){
                    maior=matriz[i][j];
                }
            }
        }

        // Agora a matriz esta preenchida manualmente pelo usuario
        System.out.println("Matriz inserida:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(maior*matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
