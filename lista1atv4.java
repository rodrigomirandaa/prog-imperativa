
import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int[] a = new int[5];
    int[] b = new int[5];

    System.out.print("Digite os 5 valores do vetor A: \n");
    
    for(int i=0; i<5; i++){
        System.out.print("Digite o valor " + (i+1) + ": \n");
        a[i] = scanner.nextInt();
    }
    
    for(int i=0; i<5; i++){
        b[i] = (int) Math.pow(a[i],2);
    }

    System.out.print("O seu vetor A: " + Arrays.toString(a) + " Resulta no vetor B: " +Arrays.toString(b));

    }
}
