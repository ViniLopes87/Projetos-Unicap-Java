package dia.da.semana;
import java.util.Scanner;
public class DiadaDaSemana {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int D,M,A,VS;
        boolean VD,BI;
        System.out.println("Em que dia da senana você nasceu?");
        System.out.print("Digite o dia em que você nasceu: ");
        D = input.nextInt();
        System.out.print("Digite o mês em que você nasceu: ");
        M = input.nextInt();
        System.out.print("Digite o ano em que você nasceu: ");
        A = input.nextInt();
        BI = BIX (A);
        VD = VALIDA (D,M,A,BI);
        VS = SEMANA (D,M,A,VD,BI);
        if (VD == true && BI == true) {
            switch (VS) {
            case 0: System.out.println("Você nasceu na Segunda-feira, data " +D+ "/" +M+ "/" +A);
                    break;
            case 1: System.out.println("Você nasceu na Terça-feira, data " +D+ "/" +M+ "/" +A);
                    break;
            case 2: System.out.println("Você nasceu na Quarta-feira, data " +D+ "/" +M+ "/" +A);
                    break;
            case 3: System.out.println("Você nasceu na Quinta-feira, data " +D+ "/" +M+ "/" +A);
                    break;
            case 4: System.out.println("Você nasceu na Sexta-feira, data " +D+ "/" +M+ "/" +A);
                    break;
            case 5: System.out.println("Você nasceu no Sábado, data " +D+ "/" +M+ "/" +A);
                    break;
            case 6: System.out.println("Você nasceu no Domingo, data " +D+ "/" +M+ "/" +A);
                    break;
        }
        }
        else if (VD = true && BI == false) {
            switch (VS) {
            case 0: System.out.println("Você nasceu na Segunda-feira, data " +D+ "/" +M+ "/" +A);
                    break;
            case 1: System.out.println("Você nasceu na Terça-feira, data " +D+ "/" +M+ "/" +A);
                    break;
            case 2: System.out.println("Você nasceu na Quarta-feira, data " +D+ "/" +M+ "/" +A);
                    break;
            case 3: System.out.println("Você nasceu na Quinta-feira, data " +D+ "/" +M+ "/" +A);
                    break;
            case 4: System.out.println("Você nasceu na Sexta-feira, data " +D+ "/" +M+ "/" +A);
                    break;
            case 5: System.out.println("Você nasceu no Sábado, data " +D+ "/" +M+ "/" +A);
                    break;
            case 6: System.out.println("Você nasceu no Domingo, data " +D+ "/" +M+ "/" +A);
                    break;
        }
        }
        else {
            System.out.println(D+ "/" +M+ "/" +A+ " Não é uma data válida!" ); 
        }     
    }
    public static boolean BIX (int a) {
        if (a % 400 == 0 || a % 4 == 0 && a % 100 != 0) {
            return true;
    }
        else {
            return false;
        }
    }
public static boolean VALIDA (int D, int M, int A,boolean a) {
    boolean DIA = false,MES = false,ANO = false; 
    if (A >= 1900 && A <= 2399) {
        ANO = true;
        if (M >= 1 && M <= 12) {
            MES = true;
            if (M == 2 && a == true) {
                if (D >= 1 && D <= 29) {
                    DIA = true;
                }
                else {
                    DIA = false;
                }
            }
            else if ( M == 4 || M == 6 || M == 9 || M == 11) {
                if (D >= 1 && D <= 30) {
                    DIA = true;
                }
                else {
                    DIA = false;
                }
            }
            else {
                if ( D >= 1 && D <= 31) {
                    DIA = true;
                }
                else {
                    DIA = false;
                }
            } 
            }
        else {
            MES =  false;
        }
        }
    else {
        ANO = false;
    }
     if (DIA == true && MES == true && ANO == true) {
         return true;
     }
     else {
         return false;
     }
    }
public static int SEMANA (int D, int M, int A, boolean VD, boolean BI) {
    int A1,B,B1 = 0,C = 0,X,XF,XF2,SEM;
    A1 = A - 1900;
    B = A1 / 4;
    if (BI == true && M >= 1 && M <= 2) {
        B1 = B - 1;
    }
    
    switch (M) {
        case 1: C = 0;
                break;
        case 2: C = 3;
                break;
        case 3: C = 3;
                break;
        case 4: C = 6;
                break;
        case 5: C = 1;
                break;
        case 6: C = 4;
                break;
        case 7: C = 6;
                break;
        case 8: C = 2;
                break;
        case 9: C = 5;
                break;
        case 10: C = 0;
                break;
        case 11: C = 3;
                break;
        case 12: C = 5;
                break;   
    }
    X = D - 1;
    if (BI == true && M >= 1 && M <= 2) {
      XF = A1 + B1 + C + X;
      XF2 = (XF % 7);  
    }
    else if (BI == true && M >= 3 && M <= 12) {
         XF = A1 + B + C + X;
         XF2 = (XF % 7);
    }
    else {
       XF = A1 + B + C + X;
       XF2 = (XF % 7); 
    }
    return XF2;   
}
}