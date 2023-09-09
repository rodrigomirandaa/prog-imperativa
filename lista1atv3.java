
import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int[] a = new int[4];
    int[] b = new int[6];
    int[] c = new int[10];
    
    System.out.print("Digite os 4 valores do vetor A: \n");
    
    for(int i=0; i<4; i++){
        System.out.print("Digite o valor " + (i+1) + ": \n");
        a[i] = scanner.nextInt();
    }
    
    System.out.print("Digite os 6 valores do vetor B: \n");
    
    for(int i=0; i<6; i++){
        System.out.print("Digite o valor " + (i+1) + ": \n");
        b[i] = scanner.nextInt();
    }
    
    System.out.print("O seu vetor C (concatenacao entre elementos do vetor a e b) e : ");
    
    for(int i = 0; i<10; i++){
        if(i<4){
            c[i] = a[i];
        } else{
            c[i] = b[i-4];        
        }
    }
    
    System.out.println(Arrays.toString(c));
    
    }
}
