//definir 2 vetores, par e impar com 10 elementos cada

import java.util.Random;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Random random = new Random();
        
        ArrayList<Integer> parArrayList = new ArrayList<>();
        ArrayList<Integer> imparArrayList = new ArrayList<>();
        
        for(int i = 0; i<10; i++){
            int numero = random.nextInt(21);
            
            if(numero%2 == 0){
                parArrayList.add(numero);
            }else{
                imparArrayList.add(numero);
            }
    }
    System.out.println("Numeros pares: " + parArrayList);
    System.out.println("Numeros impares: " + imparArrayList);

}}
