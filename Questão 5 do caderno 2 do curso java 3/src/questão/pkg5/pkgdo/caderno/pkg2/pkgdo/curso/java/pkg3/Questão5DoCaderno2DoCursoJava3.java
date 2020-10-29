package questão.pkg5.pkgdo.caderno.pkg2.pkgdo.curso.java.pkg3;

import java.util.Scanner;

public class Questão5DoCaderno2DoCursoJava3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[]VetA = new int[20];
        int[]VetB = new int[20];
        int num,cont,maior;
        
        for(cont = 0;cont < VetA.length;cont++){
            System.out.print("Informe valor do " + (cont+1) + "º elemento: ");
            num = input.nextInt();
            VetA[cont] = num;
        }
        
        maior = VetA[0];
        for(cont = 0;cont < VetA.length;cont++){  
            if(VetA[cont] > maior){
                maior = VetA[cont];
            }
        }
        
        for(cont = 0;cont < VetA.length;cont++){
            VetB[cont] = VetA[cont]/maior;
        }
        
        for(cont = 0;cont < VetB.length;cont++){ 
            System.out.println("Os valores armazenados em B é de " + VetB[cont]);
        }
    }   
}