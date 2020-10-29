package programa.para.receber.o.número.pkgdo.cpf.e.validar.string;

import java.util.Scanner;

public class ProgramaParaReceberONúmeroDoCPFEValidarString {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         String CPF;
         char num;
         int tam,i,resp = 0;
         
         do{
         System.out.print("Informe o número do CPF: ");
         CPF = input.nextLine();
         tam = CPF.length();
         for(i = 0;i < tam;i++){
             num = CPF.charAt(i);
             if(tam == 11 && Character.isDigit(num)){
                 resp = 0;
             }
             else{
                 System.out.println("CPF inválido");
                 resp = 1;
                 break;
             }
         }
         }while(resp == 1);
         for(i = 0;i < tam;i++){
            num = CPF.charAt(i); 
            System.out.print(num);
            if(i == 2){
                System.out.print(".");
            }
            if(i == 5){
                System.out.print(".");
            }
            if(i == 8){
                System.out.print("-");
            }
         }
         System.out.println();    
    }
}