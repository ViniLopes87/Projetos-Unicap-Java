package projeto.data.objeto;

import java.util.Scanner;

public class ProjetoDataObjeto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor,d,m,a;
        Data d1 = new Data(6,10,2020);
        d1.verData();
        System.out.print("Acrescentar mais quantos dias na data: ");
        valor = input.nextInt();
        d1.aumentar(valor);
        d1.verData();
        System.out.println("Digite uma data:");
        System.out.print("Dia: ");
        d = input.nextInt();
        System.out.print("Mês: ");
        m = input.nextInt();
        System.out.print("Ano: ");
        a = input.nextInt();
        Data d2 = new Data(d,m,a);
        d1.distancia(d,m,a);
    }
}