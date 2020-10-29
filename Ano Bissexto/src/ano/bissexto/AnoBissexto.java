package ano.bissexto;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int A;
        System.out.print("Informe o ano: ");
        A = input.nextInt();
         
        
    if(A % 400 == 0){
        System.out.println("O ano será bissexto");   
    }
    if(A % 4 == 0 && A % 100 != 0 ){
        System.out.println("O ano será bissexto");
    }
    else{
        System.out.println("O ano não será bissexto");
    }
    }  
}