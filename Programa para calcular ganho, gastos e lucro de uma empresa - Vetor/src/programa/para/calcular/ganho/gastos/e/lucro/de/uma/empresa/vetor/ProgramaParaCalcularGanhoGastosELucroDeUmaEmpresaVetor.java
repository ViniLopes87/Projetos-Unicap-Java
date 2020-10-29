package programa.para.calcular.ganho.gastos.e.lucro.de.uma.empresa.vetor;

import java.util.Scanner;

public class ProgramaParaCalcularGanhoGastosELucroDeUmaEmpresaVetor {
    public static double MediaLucro(double TLucro){
        double aux;
        
        aux = TLucro/12;
        
        return aux;    
    }
    public static double CalcularTotal(double[]Vet){
        double aux = 0;
        int i;
        
        for(i = 0;i < Vet.length;i++){
            aux = aux + Vet[i];
        }
            return aux;
    }
    public static void acharlucro(double[]VetGanho,double[]VetGasto,double[]VetLucro){
        int i; 
        for(i = 0;i < VetLucro.length;i++){
            VetLucro[i] = VetGanho[i] - VetGasto[i];
        }
            exibirVet(VetGanho,VetGasto,VetLucro);
    }
    public static void exibirVet(double[]VetGanho,double[]VetGasto,double[]VetLucro){
        int i,cont = 0;
        for(i = 0;i < VetGanho.length;i++){
            cont++;
            System.out.println("O valor do ganho do " + cont + "º mês é igual a R$" + VetGanho[i]);
            System.out.println("O valor do gasto do " + cont + "º mês é igual a R$" + VetGasto[i]);
            System.out.println("O valor do lucro do " + cont + "º mês é igual a R$" + VetLucro[i]);
        }    
    }
       public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            
            int contG = 0,contP = 0,cont = 0,i = 0;
            double CR,CP,CL,ML;
            double[]VetGanho;
            double[]VetGasto;
            double[]VetLucro;
            VetGanho = new double[2];
            VetGasto = new double[2];
            VetLucro = new double[2];
            
            do{ 
            cont = cont + 1;
            contG = contG + 1;
            contP = contP + 1;
            
            System.out.print("Informe o valor do ganho no " + contG + "º mês: ");
            VetGanho[i] = input.nextDouble();
            
            while(VetGanho[i] < 0){
                System.out.println("Valor inválido");
                System.out.print("Informe o valor do ganho no " + contG + "º mês: ");
                VetGanho[i] = input.nextDouble();
            }
                 
            System.out.print("Informe o valor do gasto no " + contP + "º mês: ");
            VetGasto[i] = input.nextDouble();
            
            while(VetGasto[i] < 0){
                System.out.println("Valor inválido");
                System.out.print("Informe o valor do gasto no " + contP + "º mês: ");
                VetGasto[i] = input.nextDouble();
            }
            
            i = i + 1;
            }while(cont != 2);
            
            acharlucro(VetGanho,VetGasto,VetLucro);
            CR = CalcularTotal(VetGanho);
            CP = CalcularTotal(VetGasto);
            CL = CalcularTotal(VetLucro);
            ML = MediaLucro(CL);
            
            System.out.println("O valor total do ganho é de R$" + CR);
            System.out.println("O valor total do gasto é de R$" + CP);
            System.out.println("O valor total do lucro é de R$" + CL);
            System.out.println("O valor do lucro médio mensal é de R$" + ML);
       }    
}