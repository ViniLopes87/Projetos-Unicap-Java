package pagamento.em.grãos;

import java.util.Scanner;

public class PagamentoEmGrãos {
    public static void main(String[] args) {
         
         int cont = 0, P;
         double N1 = 1, N2 = 2;
         
    while(cont != 64){
        cont = cont + 1;
        N1 = N1 * N2;
        
        System.out.println("O valor a ser pago vai ser de: " + N1);
    }
    
    }
    
}