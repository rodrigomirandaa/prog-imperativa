import java.util.Scanner;

class lista1atv1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 5 numeros inteiros em sequencia e voce recebera o numero multiplicado por 3: \n");
       
        int[] a = new int[5];
        //lervetor a
        for(int i = 0; i< 5; i++){
            System.out.print("Digite o numero " + (i+1) +" :\n");
            a[i] = scanner.nextInt();
        }
        //itera sobre vetor a e apresenta vetor b que e os valores do a mult por 3
        int[] b = new int[5];
        int j=0;
        
        System.out.print("A lista de vetores e: \n");

        for (int numeros : a){
            b[j] = (a[j] * 3);
            System.out.print(b[j]+"\n");
            j++;
        }
    }
}
