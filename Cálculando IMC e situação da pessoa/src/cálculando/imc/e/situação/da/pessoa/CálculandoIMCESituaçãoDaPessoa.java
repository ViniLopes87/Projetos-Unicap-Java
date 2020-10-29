package cálculando.imc.e.situação.da.pessoa;

import java.util.Scanner;

public class CálculandoIMCESituaçãoDaPessoa {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
         double P,A,IMC;
         char resp;
         int cont = 0;
         
    while(cont == 0){
        System.out.print("Informe a altura: ");
        A = input.nextDouble();
        System.out.print("Informe o peso: ");
        P = input.nextDouble();
        
        IMC = P/(A * A);
        
    while(A < 1.0 || A > 2.5){
        System.out.println("Altura inválida");
        System.out.print("Informe a altura entre 1,0 a 2,5: ");
        A = input.nextDouble();
    }
    
    while(P < 30 || P > 300){
        System.out.println("Peso inválido");
        System.out.print("Informe o peso entre 30kg a 300kg: ");
        P = input.nextDouble();
    }    
        
    if(IMC < 18.5){
        System.out.println("Seu IMC é " + IMC + " e está abaixo do peso ideal");
    }
    else if(IMC >= 18.5 && IMC < 25.0){
        System.out.println("Seu IMC é " + IMC + " e está de parabéns, seu peso está idela");
    }
    else{
        System.out.println("Seu IMC é " + IMC + " e está acima do peso ideal(sobrepeso)");
    }
    
    System.out.println("Existe outro participante?");
    resp = input.next().charAt(0);
    
    while(resp != 'S' && resp != 'N'){
        System.out.println("Resposta inválida");
        System.out.print("Digite uma resposta com S ou N: ");
        resp = input.next().charAt(0);
    }
    
    if(resp == 'N'){
        cont = 1;
    }
    
    }
    
    }
    
}