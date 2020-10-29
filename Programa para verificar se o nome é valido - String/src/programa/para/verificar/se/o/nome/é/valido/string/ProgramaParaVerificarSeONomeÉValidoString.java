package programa.para.verificar.se.o.nome.é.valido.string;

import java.util.Scanner;

public class ProgramaParaVerificarSeONomeÉValidoString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        char Letra;
        int i,tam,resp = 0;
        
        do{
        System.out.print("Informe um nome: ");
        nome = input.nextLine();
        tam = nome.length();
            for(i = 0;i < tam;i++){
                Letra = nome.charAt(i);
                Letra = Character.toLowerCase(Letra);
            if(Character.isLetter(Letra) || Character.isSpaceChar(Letra)){
               resp = 0;
            }
            else{
               System.out.println("Nome inválido, só pode conter letras");
               resp = 1;
               break;
            }   
            }
        }while(resp == 1);
            nome = nome.toUpperCase();
           System.out.println(nome);  
    }
}