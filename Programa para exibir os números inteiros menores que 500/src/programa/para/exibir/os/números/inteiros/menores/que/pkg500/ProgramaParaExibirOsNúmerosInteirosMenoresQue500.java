package programa.para.exibir.os.números.inteiros.menores.que.pkg500;

import java.util.Scanner;

public class ProgramaParaExibirOsNúmerosInteirosMenoresQue500 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
         int N = 0, cont = 0;
        
    while(cont == 0){
        N = N + 1;
    
    if(N < 500 && N % 9 == 4){
        System.out.println("O número que seja menor que 500 e se dividido por 9 dar resto 4 é: " + N);
    }
    if(N == 500){
        cont = 1;
    }
    }
    }
    
}
