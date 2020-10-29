package programa.para.contar.a.quantidade.de.palavras.em.uma.frase.string;

import java.util.Scanner;

public class ProgramaParaContarAQuantidadeDePalavrasEmUmaFraseString {
    public static boolean validarFrase(String n) {
        int i, tam = n.length();
        boolean valido = true;
        char car;
        for (i = 0; i < tam; i++) {
            car = n.charAt(i);
            if (Character.isLetter(car) == false && Character.isSpaceChar(car) == false && car == '.' && car == ','&& car == ';'&& car == '?'&& car == '!'&& car == ':') {
                valido = false;
                break;
            }
        }
        return valido;
    }
    public static int ContarFrase(String n) {
        int tam = n.length();
        int pos = 0;
        char c;
        int cont = 0;
        while (pos < tam) {
            // achar inicio de uma palavra
            c = n.charAt(pos);
            while (Character.isSpaceChar(c) == true || c == '.' || c == ',' || c == ';' || c == '?' || c == '!' || c == ':') {
                pos++;
                if (pos < tam) {
                    c = n.charAt(pos);
                } else {
                    break; // achou o final do nome
                }
            }
            // está no início de uma palavra. achar o final da palavra
            if (pos < tam) {
                while (Character.isLetter(c) == true) {
                    pos++;
                    if (pos < tam) {
                        c = n.charAt(pos);
                    } else {
                        break;
                    }
                }
                cont++;
            }
        }
        return cont;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String frase;
        int cont;
        System.out.print("Informe a frase: ");
        frase = input.nextLine();
        
        while (validarFrase(frase) == false) {
            System.out.print("Frase inválida. Digite apenas letras e espaços: ");
            frase = input.nextLine();
        }
        
        cont = ContarFrase(frase);
        System.out.println("A frase possui " + cont + " palavras");
    }
}