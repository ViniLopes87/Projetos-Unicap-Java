package programa.para.verificar.o.dígito.verificador.de.um.cpf.string;

import java.util.Scanner;

public class ProgramaParaVerificarODígitoVerificadorDeUmCPFString {
    public static boolean VerificarCPF(String cpf){
        int tam = cpf.length(),i;
        char num;
        boolean resultado = true;
        
        for(i = 0;i < tam;i++){
            num = cpf.charAt(i);
            if(Character.isDigit(num) == false){
                resultado = false;
                break;
            }
        }
        return resultado;
    }
    public static boolean VerificarDV(String cpf){
        int tam = cpf.length(),i,cont1 = 10,cont2 = 11,resto1,resto2;
        int[]Vet = new int[tam];
        char num;
        double soma1 = 0,soma2 = 0;
        
        for(i = 0;i < tam;i++){
            num = cpf.charAt(i);
            Vet[i] = num - '0';
        }
        for(i = 0;i < tam - 2;i++){
            soma1 = soma1 + Vet[i] * cont1;
            cont1--;
        }
        resto1 = (int)soma1 % 11;
        if(resto1 < 2){
            if(Vet[9] == 0){
                for(i = 0;i < tam - 1;i++){
                    soma2 = soma2 + Vet[i] * cont2;
                    cont2--;
                }
                resto2 = (int)soma2 % 11;
                if(resto2 < 2){
                    if(Vet[10] == 0){
                        return true;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    if(Vet[10] == 11 - resto2){
                        return true;
                    }
                    else{
                        return false;
                    }
                } 
            }
            else{
                return false;
            }
        }
        else{
            if(Vet[9] == 11 - resto1){
                for(i = 0;i < tam - 1;i++){
                    soma2 = soma2 + Vet[i] * cont2;
                    cont2--;
                }
                resto2 = (int)soma2 % 11;
                if(resto2 < 2){
                    if(Vet[10] == 0){
                        return true;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    if(Vet[10] == 11 - resto2){
                        return true;
                    }
                    else{
                        return false;
                    }
                }
            }
            else{
                return false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String CPF;
        char resp;
        int tam;    
        
        do{
            System.out.print("Informe o número do CPF: ");
            CPF = input.nextLine();
            tam = CPF.length();
            
            if(tam != 11){
                System.out.println("CPF inválido, informe exatamento 11 números");
            }
            else if(VerificarCPF(CPF) == false){
                System.out.println("CPF inválido, informe apenas dígitos numéricos");
            }
            else{
                if(VerificarDV(CPF) == false){
                    System.out.println("Dígito verificador inválido");
                }
                else{
                    System.out.println("Dígito verificador válido");
                }
            }
                    System.out.println("Deseja realizar uma nova consulta?");
                    System.out.print("Utilize S ou N para responder: ");
                    resp = input.next().charAt(0); input.nextLine();
                    resp = Character.toUpperCase(resp);
                    
                    while(resp != 'S' && resp != 'N'){
                        System.out.println("Resposta inválida");
                        System.out.print("Utilize S ou N para responder: ");
                        resp = input.next().charAt(0); input.nextLine();
                        resp = Character.toUpperCase(resp);
                    }
                    
        }while(resp != 'N');
    }   
}