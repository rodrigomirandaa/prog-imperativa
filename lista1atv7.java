//gerar 10 numeros reais
//preencher um vetor com esses numeros
//qtd de numeros negaivos
//soma dos numeros positivos

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

class Main {
    
    public static void main(String[] args) {
        //instancia da classe random        
        Random random = new Random();

        double[] vetorAleatorio = new double[10];
        int contadorNegativo = 0;
        double somaPositivo = 0;

      //gera valores aleatorios e coloca na array, conta a soma e o numero de numeros negativos
        for(int i = 0; i<10; i++){
            double numeroReal = random.nextDouble() * 3 - 1;
            vetorAleatorio[i] = numeroReal;
            if(numeroReal > 0){
                somaPositivo = somaPositivo + numeroReal ;
            }else{
                contadorNegativo ++;
            }
        }
        System.out.print("Temos: "+ contadorNegativo + " numeros negativos, a soma dos numeros positivos e: "+ somaPositivo + " e por fim vetor gerado e: \n" + Arrays.toString(vetorAleatorio));
    }
}
