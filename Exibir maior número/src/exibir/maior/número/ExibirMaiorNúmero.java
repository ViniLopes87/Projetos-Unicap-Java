package exibir.maior.número;

import java.util.Scanner;

public class ExibirMaiorNúmero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,n2;
        System.out.print("Informe o valor do número 1: ");
        n1 = input.nextInt();
        System.out.print("Informe o valor do número 2: ");
        n2 = input.nextInt();
        
    if(n1 > n2){
        System.out.println("O maior número é " + n1);
    }
    else if (n1 == n2){
        System.out.println("Os número são iguais = " + n1);
    }
    else{
        System.out.println("O maior número é " + n2);
    }
    }
    
}
