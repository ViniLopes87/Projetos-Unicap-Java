package imposto.na.hora.da.transferência;

import java.util.Scanner;

public class ImpostoNaHoraDaTransferência {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double P,I;
        int A;
        System.out.print("Informe o preço do carro: ");
        P = input.nextDouble();
        System.out.print("Informe o ano do carro: ");
        A = input.nextInt();
        
    if(A < 2000){
        I = P * 0.01; 
    }
    else{
        I = P * 0.015;
    }
    System.out.println("O preço do imposto vai ser =" + I);
    }   
}
