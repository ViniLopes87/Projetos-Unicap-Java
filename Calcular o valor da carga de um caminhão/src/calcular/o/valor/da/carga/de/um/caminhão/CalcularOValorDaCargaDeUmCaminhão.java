package calcular.o.valor.da.carga.de.um.caminhão;

import java.util.Scanner;

public class CalcularOValorDaCargaDeUmCaminhão {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        double P,VC,VI,VT;
        int  IC,IL;
        System.out.print("Informe o peso da carga: ");
        P = input.nextDouble();
        System.out.print("Informe o código de identificação da carga de 10 a 40: ");
        IC = input.nextInt();
        System.out.print("Informe o código de indentificação do local de 1 a 5: ");
        IL = input.nextInt();
    
    if(IC >= 10 && IC <= 20){
        VC = (P * 1000) * 10;
    }
    else if(IC >= 21 && IC <= 30){
        VC = (P * 1000) * 25;
    }
    else{
        VC = (P * 1000) * 35;
    }
    if(IL == 1){
        VI = VC * 0.35;
    }
    else if(IL == 2){
        VI = VC * 0.25;               
    }
    else if(IL == 3){
        VI = VC * 0.15;
    }
    else if(IL == 4){
        VI = VC * 0.05;
    }
    else{
        VI = 0;
    }
    VT = VC + VI;
    System.out.println("O valor da carga é R$ " + VC + " e será cobrado R$ " + VI + " de imposto, dando um total de R$ " + VT + " a pagar.");
    }   
}
