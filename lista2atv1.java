//ler um vetor de notas com tamanho definido pelo usuario
//calcular a media das notas
//exibir as notas maiores que a media
//exibir as notas menores que a media
//restricoes 0 a 10


import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

class Main {
    
  //funcao para comparar as notas maiores e menores q a media e colocar no seu respectivo vetor
    public static void comparaMedia(int notas[], double media){
    
        ArrayList<Integer> maiorMedia = new ArrayList<>();
        ArrayList<Integer> menorMedia = new ArrayList<>();
        
        for(int nota : notas){
            if(nota>media){
                maiorMedia.add(nota);
            }else{
                menorMedia.add(nota);
            }
        }
        System.out.println("Notas maiores que a media: " + Arrays.toString(maiorMedia.toArray()));
        System.out.println("\nNotas menores ou iguais a media: " + Arrays.toString(menorMedia.toArray()));
    }
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o numero de notas que vao ser inseridas: ");
        int qtdNotas = scanner.nextInt();
        int[] notas = new int[qtdNotas];
        int somaNotas = 0;
        
        //loop para verificar e coletar as notas validas
        for(int i = 0; i < qtdNotas; i++){
            do {
                System.out.print("Digite a nota " + (i+1) + ": ");
                notas[i] = scanner.nextInt();
                if (notas[i] < 0 || notas[i] > 10) {
                    System.out.println("Digite uma nota valida (entre 0 e 10).");
                }
            } while (notas[i] < 0 || notas[i] > 10);
  
            somaNotas += notas[i];
        }
        
        double media = (double)somaNotas/qtdNotas;
        
        //chama a funcao p comparar media
        comparaMedia(notas, media);
        
    }
}
