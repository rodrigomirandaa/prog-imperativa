//ler dois vetores de msm tamanho
//pegar os valores iguais e colocar no outro vetor

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

class Main {
    //funcao para calcular o vetor intersec
    public static void calculaIntersec(int[] vetorUm, int[] vetorDois){
    
        ArrayList<Integer> vetorIntersec = new ArrayList<>();
        
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(vetorUm[i] == vetorDois[j]){
                    vetorIntersec.add(vetorUm[i]);
                }
            }
        }
        System.out.print(Arrays.toString(vetorIntersec.toArray()));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int vetorUm[] = new int[5];
        int vetorDois[] = new int[5];
        
        for(int i = 0; i<5; i++){
            System.out.print("Digite o valor "+ (i+1) + " do vetor 1 : \n");
            vetorUm[i] = scanner.nextInt();
        }
            
        for(int i = 0; i<5; i++){
            System.out.print("Digite o valor "+ (i+1) + " do vetor 2 : \n");
            vetorDois[i] = scanner.nextInt();
        }
        calculaIntersec(vetorUm, vetorDois);
        }
}
