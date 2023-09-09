//ler numeros
//identificar valores primos
//retornar vetor com valores primos

import java.util.Scanner;
import java.util.Arrays;


class Main {
    //funcao para verificar numero primo
    public static boolean verificaPrimo(int numero) {
       
        if(numero<=1){
            return false;
        }
        for(int i = 2; i<numero; i++){
            if(numero % i == 0){
                return false;
            }
        }
        return true;
    }
    
    //funcao main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetorNumeros = new int[5];
        int[] vetorPrimos = new int[5];
        int contadorPrimos = 0;
        

        for(int i = 0; i<5; i++){
            System.out.print("Digite o numero " + (i+1) +" :\n");
            vetorNumeros[i] = scanner.nextInt();
        }
        //percorre o vetor de numeros e chama a funcao p saber se e primo, se for entra no vetor
        for(int numeros : vetorNumeros){
            if(verificaPrimo(numeros) == true){
                vetorPrimos[contadorPrimos] = numeros;
                contadorPrimos ++;
            }
        }
        int[] vetorPrimosSem0 = new int[contadorPrimos];
        //loop para tirar os zeros
        for(int i =0; i< contadorPrimos; i++){
            if(vetorPrimos[i] != 0){
                vetorPrimosSem0[i] = vetorPrimos[i];
            }
            
        }
        System.out.print("O numero de valores primos e: " + contadorPrimos + " e o array que os armazena e:  " + Arrays.toString(vetorPrimosSem0));
        }

    }
