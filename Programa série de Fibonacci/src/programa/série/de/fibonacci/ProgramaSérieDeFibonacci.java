package programa.série.de.fibonacci;

import java.util.Scanner;

public class ProgramaSérieDeFibonacci {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
         int anterior = 1, cont = 0, Q = 0, atual = 0, proximo = 0;
         
    while(cont == 0){
         proximo = atual + anterior;
         anterior = atual;
         atual = proximo;
         Q = Q + 1;
         
         System.out.println(+ proximo);
         
    if(Q == 30){
        cont = 1;
    }
    }
    }
    
}
