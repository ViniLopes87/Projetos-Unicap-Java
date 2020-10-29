package salário.pkgdo.funcionário.que.recebe.em.hora.extra;

import java.util.Scanner;

public class SalárioDoFuncionárioQueRecebeEmHoraExtra {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double SM,ST,SR,DI,QH;
        System.out.print("Informe o valor do salário mínimo:");
        SM = input.nextDouble();
        System.out.print("Informe a quantiade de horas trabalhadas:");
        QH = input.nextDouble();
        
        ST = (0.05 * SM) * QH;
        
    if(ST > 1500){
        DI = ST * 0.075;
        SR = ST - DI;
        System.out.println("O salário do funcionário = " + ST);
        System.out.println("O desconto do imposto = " + DI);
        System.out.println("O salário a receber = " + SR);
        }   
    else{
        System.out.println("O salário a receber = " + ST);          
        }
    }
}
