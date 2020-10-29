package ver.se.os.segmentos.formam.um.triângulo.e.classificar.ele;

import java.util.Scanner;

public class VerSeOsSegmentosFormamUmTriânguloEClassificarEle {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double S1,S2,S3;
        System.out.print("Informe o tamanho do segmento de reta 1: ");
        S1 = input.nextDouble();
        
        System.out.print("Informe o tamanho do segmento de reta 2: ");
        S2 = input.nextDouble();
        
        System.out.print("Informe o tamanho do segmento de reta 3: ");
        S3 = input.nextDouble();
        
    if( S1 + S2 > S3 && S2 + S3 > S1 && S1 + S3 > S2){
        System.out.println("Esses segmentos juntos pode se formar um triângulo");    
    
    if(S1 == S2 && S2 == S3){
        System.out.println("Esse triângulo é equilátero");
    }
    if(S1 == S2 || S2 == S3 || S1 == S3){
        System.out.println("Esse triângulo é isósceles");
    }
    if(S1 != S2 && S2 != S3){
        System.out.println("Esse triângulo é escaleno");
    }
    }
    
    else{
        System.out.println("Esses segemntos não podem formar um triângulo");
    }
    
    }
    
}
    
    

