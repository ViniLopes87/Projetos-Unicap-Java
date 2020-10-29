package pkg2ª.questão.pkgdo.curso.java.pkg3;

import java.util.Scanner;

public class QuestãoDoCursoJava3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double VC,VV,L;
        int cont1 = 0,cont2 = 0;
        char A,resp;
        
        do{
        System.out.print("Informe o tipo de ação: ");
        A = input.next().charAt(0);
        System.out.print("Informe o preço de compra da ação: ");
        VC = input.nextDouble();
        System.out.print("Informe o preço de venda da ação: ");
        VV = input.nextDouble();
        
        L = VV - VC;
        
         if(L > 1000){
            cont1++;
         }
         else if(L < 200){
            cont2++;
         }
         
         System.out.print("Tem mais alguma ação, utilize S ou N: ");
         resp = input.next().charAt(0);
        }while(resp == 'S');
        
        System.out.println("A quantidade de ações com lucro superior que 1000 reais foi de " + cont1);
        System.out.println("A quantidade de ações com lucro inferior que 200 reais foi de " + cont2);
    }   
}