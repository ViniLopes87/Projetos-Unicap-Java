package programa.para.exibir.a.tabuada.de.todos.os.número.de.pkg1.a.pkg10;

import java.util.Scanner;

public class ProgramaParaExibirATabuadaDeTodosOsNúmeroDe1A10 {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
         int N,cont1,cont2 = 1,T;
        
        for(N = 1;N != 11;N = N + 1){
            System.out.println("Tabuada de " + N + ":");
           for(cont1 = 0;cont1 != 11;cont1 = cont1 + 1){
               T = N * cont1;
               System.out.println(T);
           }
        } 
    }   
}