package idade.pra.votar;

import java.util.Scanner;

public class IdadePraVotar {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int I;
        System.out.print("Informe a idade da pessoa: ");
        I = input.nextInt();
        
    if (I >= 16){
        System.out.println("Esta pessoa tem " + I + " anos e pode votar");        
    }
    else{
        System.out.println("Esta pessoa tem " + I + " anos e não pode votar");
        
    }
    }
    
}
