
import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);

    int a[] = new int[5];
    int r[] = new int[5];

    for(int i=0;i<5;i++){
        System.out.print("Digite o valor " + (i+1) + ": \n");
        a[i] = scanner.nextInt();
    }
    
    for(int i=0;i<5;i++){
        r[i] = a[5-i-1];
    }
    
    System.out.print("O vetor A: " + Arrays.toString(a) + " Resulta no vetor inverso R: " +Arrays.toString(r));
    }
}
