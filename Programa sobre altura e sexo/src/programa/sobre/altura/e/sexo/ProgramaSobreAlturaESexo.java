package programa.sobre.altura.e.sexo;

import java.util.Scanner;

public class ProgramaSobreAlturaESexo {
    public static void main(String[] args) {
         
         Scanner input = new Scanner(System.in);
         double A,MAM,MAF,somaH = 0,somaF = 0;
         double GA,PA;
         char sexo;
         int cont = 0,QM = 0,QF = 0;
         PA = 2.0;
         GA = 0.5;
    
    while(cont != 50){
        cont = cont + 1;
        System.out.print("Informe a altura entre 0,5 a 2,0: ");
        A = input.nextDouble();
        System.out.print("Informe o sexo com M ou F: ");
        sexo = input.next().charAt(0);
        
    while(A < 0.5 || A > 2.0){
        System.out.println("Altura inválida");
        System.out.print("Informe a altura entre 0,5 a 2,0: ");
        A = input.nextDouble();
    }
    
    while(sexo != 'M' && sexo != 'm' && sexo != 'F' && sexo != 'f'){
        System.out.println("Sexo inválido");
        System.out.print("Informe o sexo com M ou F: ");
        sexo = input.next().charAt(0);
    }
    
    if(sexo == 'M' || sexo == 'm'){
        somaH = somaH + A;
        QM = QM + 1;
    }
    if(cont == 50){
        MAM = somaH /QM;
        System.out.println("A média de altura dos homens é " + MAM);
    }
    
    if(sexo  == 'F' || sexo == 'f'){
        somaF = somaF + A;
        QF = QF + 1;
    }
    if(cont == 50){
        MAF = somaF/QF;
        System.out.println("A média de altura das mulheres é " + MAF);
    }
    
    if(A > GA){
        GA = A;
    }
    if(A < PA){
        PA = A;
    }
    
    } 
    System.out.println("A maior altura é " + GA);
    System.out.println("A menor altura é " + PA);
    }
    
}
