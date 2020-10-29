package pkg1ª.quetão.pkgdo.curso.java.pkg3;

import java.util.Scanner;

public class QuetãoDoCursoJava3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,cont = 0,contf = 0,maiori = 0,menori = 100,mi = 0;
        char sexo,ms = 'F',resp;
        double s,conts = 0,MS,menors = 1000000000;
        
        do{
        System.out.print("Informe a idade da pessoa: ");
        i = input.nextInt();
        System.out.print("Informe o sexo da pessoa utilizando M ou F: ");
        sexo = input.next().charAt(0);
        System.out.print("Informe o salário da pessoa: ");
        s = input.nextDouble();
        
        cont++;
        conts = conts + s;
        
        if(i > maiori){
            maiori = i;
        }
        if(i < menori){
            menori = i;
        }
        if(sexo == 'F' && s <= 1500){
            contf++;
        }
        if(s < menors){
            mi = i;
            ms = sexo;
        }
        
            System.out.print("Tem mais alguma pessoa no grupo utilize S ou N: ");
            resp = input.next().charAt(0);
        }while(resp == 'S');
        
        MS = conts/cont;
        
        System.out.println("A média salarial do grupo é de " + MS + " reais");
        System.out.println("A maior idade do grupo é de " + maiori + " anos");
        System.out.println("A menor idade do grupo é de " + menori + " anos");
        System.out.println("A quantidade de mulheres que ganham até 1500 reias é de " + contf + " mulheres");
        System.out.println("A pessoa de menor salário tem " + mi + " anos e é do sexo " + ms);
        
    }
}