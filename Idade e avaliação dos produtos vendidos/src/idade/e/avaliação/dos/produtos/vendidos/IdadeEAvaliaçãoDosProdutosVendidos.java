package idade.e.avaliação.dos.produtos.vendidos;

import java.util.Scanner;

public class IdadeEAvaliaçãoDosProdutosVendidos {
    public static void main(String[] args) {
         
         Scanner input = new Scanner(System.in);
         int cont = 0,QPG = 0,QPO = 0,I,somaI = 0;
         double P,M;
         char result;
    
    while(cont != 300){
        cont = cont + 1;
        System.out.print("Informe a idade: ");
        I = input.nextInt();
        System.out.print("Informe a sua avaliação (A - Ótimo /B - Bom /C - Regular /D - Ruim /E - Péssimo): ");
        result = input.next().charAt(0);
    
    while(I < 18 || I > 65){
        System.out.println("Idade inválida");
        System.out.print("Informe a idade entre 18 a 65: ");
        I = input.nextInt();
    }
        
    while(result != 'A' && result != 'B' && result != 'C' && result != 'D' && result != 'E'){
        System.out.println("Opnião inválida");
        System.out.print("Informe a sua avaliação (A - Ótimo /B - Bom /C - Regular /D - Ruim /E - Péssimo): ");
        result = input.next().charAt(0);
    }    
    
    if(result == 'A' || result == 'B'){
        QPG = QPG + 1;
        somaI = somaI + I;
    }
    if(cont == 300){    
        M = somaI/QPG;
        System.out.println("A média de idade das pessoas que gostaram foi de " + M + " anos");
    }
    
    if(result == 'D' || result == 'E'){
        QPO = QPO + 1;
    }    
    if(cont == 300){    
        P = (QPO * 100.0)/300;
        System.out.println("O percentual das pessoas que não gostaram foi de " + P + "%");
    }
    
    }
          
    }
    
}