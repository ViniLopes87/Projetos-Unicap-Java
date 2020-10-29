package pagamento.pkgdo.produto.e.dividido.em.parcelas;

import java.util.Scanner;

public class PagamentoDoProdutoEDivididoEmParcelas {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double VO, VT,VP,D;
        int P;
        System.out.print("Informe o valor do objeto: ");
        VO = input.nextDouble();
        System.out.print("Informe o tipo de pagamento 1- À vista, 2- Em cheque, 3- Em 3x, 4- Em 6x, 5- Em 12x: ");
        P = input.nextInt();
        
    if(P == 1){
        D = VO * 0.15;
        VT = VO - D;
        VP = 0;
    }
    else if(P == 2){
        D = VO * 0.10;
        VT = VO - D;
        VP = 0;
    }
    else if(P == 3){
        D = VO * 0.05;
        VT = VO - D;
        VP = VT/3;
        System.out.println("A quantidade de parcelas será de 3");
    }
    else if(P == 4){
        D = 0;
        VT = VO;
        VP = VT/6;
        System.out.println("A quantidade de parcelas será de 6");
    }
    else{
        D = VO * 0.08;
        VT = VO + D;
        VP = VT/12;
        System.out.println("A quantidade de parcelas será de 12");        
    }
        System.out.println("O valor da compra é de R$ " + VO + " e o valor final é de R$ " + VT + " com uma diferença de R$ " + D + " e o valor de cada parcela é de R$ " + VP);
    }    
}
