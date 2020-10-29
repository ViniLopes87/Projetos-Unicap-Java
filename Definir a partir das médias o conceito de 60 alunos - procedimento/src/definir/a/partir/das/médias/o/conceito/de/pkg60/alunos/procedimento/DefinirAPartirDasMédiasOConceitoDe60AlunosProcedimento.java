package definir.a.partir.das.médias.o.conceito.de.pkg60.alunos.procedimento;

import java.util.Scanner;

public class DefinirAPartirDasMédiasOConceitoDe60AlunosProcedimento {
    public static char conceito(double a){
        if(a >= 0 && a < 5){
            return 'D';
        }
        else if(a >= 5 && a < 7){
            return 'C';
        }
        else if(a >= 7 && a < 9){
            return 'B';
        }
        else{
            return 'A';
        }
    }
        public static void media(double a,double b){
            double aux;
            char C;
            aux = (a + b)/2;
            C = conceito(aux);
            System.out.println("A média foi de " + aux + " e seu conceito foi " + C);
        }
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                double N1,N2;
                int cont = 0;
                
                do{
                cont = cont + 1;
                System.out.print("Informe a primeira nota do " + cont + "º aluno: ");
                N1 = input.nextDouble();
                
                while(N1 < 0 || N1 > 10){
                    System.out.println("Nota inválida");
                    System.out.print("Informe a primeira nota do " + cont + "º aluno: ");
                    N1 = input.nextDouble();
                }
                
                System.out.print("Informe a segunda nota do " + cont + "º aluno: ");
                N2 = input.nextDouble();
                
                while(N2 < 0 || N2 > 10){
                    System.out.println("Nota inválida");
                    System.out.print("Informe a segunda nota do " + cont + "º aluno: ");
                    N2 = input.nextDouble();
                }
                
                media(N1,N2);
                }while(cont != 60);
            }   
}