package programa.sobre.maternidade.e.recém.nascidos;

import java.util.Scanner;

public class ProgramaSobreMaternidadeERecémNascidos {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
         char sexo,prematuro,result;
         double PM,PF,P,D,M,soma = 0,MD;
         int cont = 0, QB = 0,QBH = 0,QBM = 0, QP = 0;
         MD = 9999;
         
    while(cont == 0){
       
        System.out.print("Diga o sexo da criança se é M ou F: ");
        sexo = input.next().charAt(0);
        System.out.print("Informe se é prematuro com S ou N: ");
        prematuro = input.next().charAt(0);
        QB = QB + 1;
      
        while(sexo != 'S' && sexo != 'N'){
         System.out.println("Sexo inválido");
         System.out.print("Diga o sexo da criança se é M ou F: ");
         sexo = input.next().charAt(0);
     }  
     
     while(prematuro != 'S' && prematuro != 'N'){
         System.out.println("Dado inválido");
         System.out.print("Informe se é prematuro com S ou N: ");
         prematuro = input.next().charAt(0);
     }
     
    
    if(prematuro == 'S'){
        System.out.print("Informe os dias que ficou na incubadora: ");
        D = input.nextDouble();
        
        QP = QP + 1;       
        soma = soma + D;
        System.out.print("Deseja fazer nova consulta?: ");
        result = input.next().charAt(0);
    
        
    while(result != 'N' && result != 'S'){
         System.out.println("Resposta inválido");
         System.out.print("Deseja fazer nova consulta?: ");
         result = input.next().charAt(0); 
    }
    
    
    if(result == 'N'){  
        cont = 1;
        M = soma/QP;
        System.out.println("A média de dias que ficou na incubadora é de " + M);
        
        P = (QP * 100)/QB;
        System.out.println("A porcentagem de recém-nascidos e prematuros é " + P + "%");
    
    if(sexo == 'M'){
        QBH = QBH + 1;
        PM = (QBH * 100)/QP;
        System.out.println("A porcentagem de recém-nascidos e prematuros do sexo masculino é " + PM + "%");
    }
    if(sexo == 'F'){
        QBM = QBM + 1;
        PF = (QBM * 100)/QP;
        System.out.println("A porcentagem de recém-nascidos e prematuros do sexo feminino é " + PF + "%");
    }
    if(D < MD){
        MD = D;
        System.out.println("O maior período de dias na incubadora foi de: " + MD);
    }
   
    }
    
    }
    
   }
    
    
    
    }
}
