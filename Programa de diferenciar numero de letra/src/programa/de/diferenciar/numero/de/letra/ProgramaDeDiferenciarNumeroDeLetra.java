package programa.de.diferenciar.numero.de.letra;

import java.util.Scanner;

public class ProgramaDeDiferenciarNumeroDeLetra {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
         int total = 0, maiuscula = 0, minuscula = 0, vogal = 0, consoante = 0, digito = 0, simbolo = 0;
         char c;
         
         System.out.print("Digite um caractere: ");
         c = input.next().charAt(0);
         
        while(c != '#'){
             total = total + 1;
            if(Character.isLetter(c) == true){
                
                if   (Character.isUpperCase(c)==true){  // if( c >= 'A' && c <= 'Z'){
                    maiuscula = maiuscula + 1;       
                }
                    else{
                     minuscula = minuscula + 1;    
                    }
                
                     c =  Character.toLowerCase(c);
                     if(c == 'a' || c == 'e' || c == 'i' || c == 'o'||c == 'u'){
                       vogal = vogal + 1;
                     }
                      else{
                        consoante = consoante + 1;
                      }
                 
            }
                     else if(c >= '0'&& c <= '9'){  //else if (Character.isDigito(c) == true){
                       digito = digito + 1;       
                     }
                        else{
                          simbolo = simbolo + 1;    
                        }
                            System.out.print("Digite outro caractere");
                            System.out.print(" ou # para encerrar o programa: ");
                            c = input.next().charAt(0);
        }
        
                           System.out.println("Total de caracteres: " + total);
                           System.out.println("Total de letras maiúscula: " + maiuscula);
                           System.out.println("Total de letras minúsculas: " + minuscula);
                           System.out.println("Total de vogais: " + vogal);
                           System.out.println("Total de consoantes: " + consoante);
                           System.out.println("Total de números: " + digito);
                           System.out.println("Total de símbolos: " + simbolo);
    }  
}