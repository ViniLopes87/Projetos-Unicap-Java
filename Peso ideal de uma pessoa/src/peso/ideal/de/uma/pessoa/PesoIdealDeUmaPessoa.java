package peso.ideal.de.uma.pessoa;

import java.util.Scanner;

public class PesoIdealDeUmaPessoa {
    public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);
        double P,A,PI;
        char sexo = 'f';
        System.out.print("Informe o gênero da pessoa: ");
        sexo = input.next().charAt(0);
        System.out.print("Informe o valor do peso real: ");
        P  = input.nextDouble();
        System.out.print("Informe o valor da altura: ");
        A = input.nextDouble();
    
    if(sexo == 'f'){
       PI = 62.1 * A - 44.7;
       System.out.println("O peso ideal é " + PI);
    
    if(P > PI){
        System.out.println("O peso real é maior que o ideal");
    }
    else if(P == PI){
        System.out.println("O peso real é igual ao ideal");
    }
    else if(P < PI){
        System.out.println("O peso real é menor que o ideal");   
    }
    }
    
    else{
        PI = 72.7 * A - 58;
        System.out.println("O peso ideal é " + PI);      
    if(P > PI){
        System.out.println("O peso real é maior que o ideal");
    }
    else if(P == PI){
        System.out.println("O peso real é igual ao o ideal");
    }
    else if(P < PI){
        System.out.println("O peso real é menor que o ideal");
    }
    }
      
    }
    
}
