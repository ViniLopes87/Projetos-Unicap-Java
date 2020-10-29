package programa.para.dada.uma.frase.tem.que.criptografar.e.exibir.string;

import java.util.Scanner;

public class ProgramaParaDadaUmaFraseTemQueCriptografarEExibirString {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         String Frase;
         char Letra;
         int tam,i;
         
         System.out.print("Escreva uma frase: ");
         Frase = input.nextLine();
         tam = Frase.length();
         
         for(i = 0;i < tam;i++){
             Letra = Frase.charAt(i);
             Letra = Character.toLowerCase(Letra);
             switch (Letra) {
                 case 'a':
                     System.out.print("@");
                     break;
                 case 'e':
                     System.out.print("$");
                     break;
                 case 'i':
                     System.out.print("&");
                     break;
                 case 'o':
                     System.out.print("*");
                     break;
                 case 'u':
                     System.out.print("#");
                     break;
                 default:
                     System.out.print(Letra);
                     break;
             }
         }
         System.out.println();
    }
}