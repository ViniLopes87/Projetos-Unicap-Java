package programa.para.dada.uma.frase.calcular.quantas.vogais.tem.string;

import java.util.Scanner;

public class ProgramaParaDadaUmaFraseCalcularQuantasVogaisTemString {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         String Frase;
         int cont = 0,i,tam;
         char letra;
         
         System.out.print("Escreva uma frase: ");
         Frase = input.nextLine();
         tam = Frase.length();
         
         for(i = 0;i < tam;i++){
              letra = Frase.charAt(i);
              letra = Character.toLowerCase(letra);
              if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                  cont++;
              }
         }
         System.out.println("A frase possui " + cont + " vogais");
    } 
}