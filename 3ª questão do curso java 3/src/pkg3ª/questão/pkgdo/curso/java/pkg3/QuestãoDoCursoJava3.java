package pkg3ª.questão.pkgdo.curso.java.pkg3;

import java.util.Scanner;

public class QuestãoDoCursoJava3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,t,conth = 0,contm = 0,conthi = 0,contmi = 0,IDMH,IDMM;
        char sexo,resp;
        
        do{
        System.out.print("Informe a idade da pessoa: ");
        i = input.nextInt();
        System.out.print("Informe o sexo da pessoa: ");
        sexo = input.next().charAt(0);
        System.out.println("Informe o tempo de experiência: ");
        t = input.nextInt();
        
        if(sexo == 'M'){
            conth++;
            conthi = conthi + i;
        }
        else if(sexo == 'F'){
            contm++;
            if(t != 0){
                contmi = contmi + i;
            }
        }
        
         System.out.print("Tem mais alguem para cadastrar?. Utilize S ou N: ");
         resp = input.next().charAt(0);
        }while(resp == 'S');
        
        IDMH = conthi/conth;
        IDMM = contmi/contm;
        
        System.out.println("O número de candidatos mulheres são de " + contm);
        System.out.println("O número de candidatos homens são de " + conth);
        System.out.println("A idade média dos homens são de " + IDMH);
        System.out.println("A idade média das mulheres com experiência são de " + IDMM);
    }   
}