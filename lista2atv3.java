//ler um vetor
//exibir um vetor simetrico com os valores da entrada

import java.util.Scanner;
import java.util.Arrays;

class Main {
    
    public static void vetorSimetrico(int vetor[]){
        int[] vetorInverso = new int[4];
        String[] vetorSimetrico = new String[4];

        for(int i=0; i<4; i++){
            vetorInverso[i] = vetor[3-i];
        }
        
        for(int i=0; i<4; i++){
            vetorSimetrico[i] = vetor[i]+"-"+vetorInverso[i];
        }
        
        System.out.print(Arrays.toString(vetorSimetrico));
        
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[4];
        
        for(int i = 0; i<4; i++){
            System.out.print("Digite o valor "+ (i+1) + " : \n");
            vetor[i] = scanner.nextInt();
        }
        
        vetorSimetrico(vetor);
        
        
    }
}
