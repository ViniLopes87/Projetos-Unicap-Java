package programa.para.exibir.os.cubos.dos.números.inteiros.de.pkg15.a.pkg25;

import java.util.Scanner;

public class ProgramaParaExibirOsCubosDosNúmerosInteirosDe15A25 {
    public static void main(String[] args) {
         
         Scanner input = new Scanner(System.in);
         int N = 0, cont = 0, T;
         
    while(cont == 0){
        N = N + 1;
    
    if(N >= 15 && N <= 25){
        T = N * N * N;
        System.out.println("O cubo dos número entre 15 a 25 é : " + T);
    }
    
    if(N > 25){
        cont = 1;
    }
    }
    }
    
}