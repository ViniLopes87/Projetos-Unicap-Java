package programa.pra.determinar.qual.o.melhor.investimento;

import java.util.Scanner;

public class ProgramaPraDeterminarQualOMelhorInvestimento {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
         double VI,P,FRF,CDB;
         int cont = 0;
         char resp;
          
    while(cont == 0){
        
        System.out.print("Qual o valor do investimento: ");
        VI = input.nextDouble();
            
    while(VI <= 0){
        System.out.println("Dados inválidos");
        System.out.print("Informe o valor do investimento que seja maior que 0: ");
        VI = input.nextDouble();
    } 
       
    if(VI >= 2500){
        CDB = VI * 0.015;
        FRF = VI * 0.01;
        P = VI * 0.005;
    }
    else if(VI >= 1000 && VI < 2500){
        FRF = VI * 0.01;
        P = VI * 0.005;
        CDB = 0;    
    }
    else if(VI >= 100 && VI < 1000){
        P = VI * 0.005;
        FRF = 0;
        CDB = 0;
    }
    else{
        P = 0;
        FRF = 0;
        CDB = 0;
    }
    
    System.out.println("O rendimento na poupança é de R$ " + P + " e no fundos de renda fixo é de R$ " + FRF + " e na CDBs é de R$ " + CDB);
    System.out.print("Deseja fazer uma nova consulta? Digite S ou N: ");
    resp = input.next().charAt(0);
    
    while(resp != 'S' && resp != 'N'){
        System.out.println("Resposta inválida");
        System.out.print("Deseja fazer uma nova consulta? Utilize as letras S ou N ");       
        resp = input.next().charAt(0);
    }
    
    if( resp == 'N'){
        cont = 1;
    }
     
        }
   
    }
    
}