// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int[] a = new int[5];
    int[] b = new int[5];
    int[] c = new int[5];
    
    System.out.print("Digite os 5 valores do vetor A: \n");
    
    for(int i=0; i<5; i++){
        System.out.print("Digite o valor " + (i+1) + ": \n");
        a[i] = scanner.nextInt();
    }
    
    System.out.print("Digite os 5 valores do vetor B: \n");
    
    for(int i=0; i<5; i++){
        System.out.print("Digite o valor " + (i+1) + ": \n");
        b[i] = scanner.nextInt();
    }
    
    System.out.print("O seu vetor C (subtracao entre elementos do vetor a e b) e : ");
    
    for(int i = 0; i<5; i++){
        c[i] = a[i] - b[i];
    }
    
    System.out.println(Arrays.toString(c));
    
    }
}
