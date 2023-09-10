//ler um vetor
//imprimir o inverso dele
import java.util.Scanner;
import java.util.Arrays;

class Main {
    
    public static void vetorInverso(int[] vetor){
        int[] vetorInverso = new int[5];
        
        for(int i=0; i<5; i++){
            vetorInverso[i] = vetor[4-i];
        }
        System.out.print(Arrays.toString(vetorInverso));
        }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetor = new int[5];
        
        for(int i = 0; i<5; i++){
            System.out.print("Digite o numero "+ (i+1) + ":\n" );
            vetor[i] = scanner.nextInt();
        }
        System.out.print("O inverso do vetor: "+ Arrays.toString(vetor) + " e: ");
        vetorInverso(vetor);
    }
}
