package teste.da.pkg1ª.questao.da.pilha;

import java.util.Scanner;

public class TesteDa1ªQuestaoDaPilha {
    public static void f1(int a){
        if(a == 0){
            System.out.println("Zero");
        }
        else{
            System.out.print(a + "");
            System.out.println(a + "");
            f1(a - 1);
        }
    }
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                int N;
                
                System.out.print("Informe o valor de N: ");
                N = input.nextInt();
                f1(N);
        }    
}