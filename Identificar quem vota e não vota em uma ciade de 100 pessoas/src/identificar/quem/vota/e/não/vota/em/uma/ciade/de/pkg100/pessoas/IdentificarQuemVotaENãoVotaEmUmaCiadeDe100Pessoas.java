package identificar.quem.vota.e.não.vota.em.uma.ciade.de.pkg100.pessoas;

import java.util.Scanner;

public class IdentificarQuemVotaENãoVotaEmUmaCiadeDe100Pessoas {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int I,cont = 0,PV = 0,NV = 0;
        double PQV,PQN;
      
    while(cont != 2){       
        cont = cont + 1;
        System.out.print("Informe a idade entre 0 a 120: ");
        I = input.nextInt();
        
        while(I < 0 || I > 120 ){
        
        System.out.println("Dados inválidos");
        System.out.print("Informe a idade entre 0 a 120: ");
        I = input.nextInt();     
    }
           
    if(I >= 18 && I <= 90){
        System.out.println("Esta pessoa tem " + I + " anos e pode votar");
        PV = PV + 1;
    }
    else{
        System.out.println("Esta pessoa tem " + I + " anos e não pode votar");
        NV = NV + 1;
      }
    }
        PQV = (PV * 100.0)/cont;
        PQN = (NV * 100.0)/cont;
    
     System.out.println("O total de pessoas é " + cont + " e desse total " + PQV + "% vai votar e " + PQN + "% não vai votar");
    }
    
}
