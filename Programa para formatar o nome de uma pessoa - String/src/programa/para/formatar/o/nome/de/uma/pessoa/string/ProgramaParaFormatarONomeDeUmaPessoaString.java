package programa.para.formatar.o.nome.de.uma.pessoa.string;

import java.util.Scanner;

public class ProgramaParaFormatarONomeDeUmaPessoaString {
    public static boolean validarNome(String n) {
        int i, tam = n.length();
        boolean valido = true;
        char car;
        for (i = 0; i < tam; i++) {
            car = n.charAt(i);
            if (Character.isLetter(car) == false && Character.isSpaceChar(car) == false) {
                valido = false;
                break;
            }
        }
        return valido;
    }
    public static String formatarNome(String n) {
        String nova;
        nova = retirarEspacos(n);
        nova = formatar(nova);
        return nova;
    }
    public static String formatar(String n) {
        int tam = n.length();
        char[] nome = new char[tam];
        int pos = 0;
        char c;
        String nova;
        while (pos < tam) {
            c = n.charAt(pos);
            nome[pos] = Character.toUpperCase(c);
            pos++;
            if (pos < tam) {
                c = n.charAt(pos);
                // achar o fim da palavra
                while (Character.isLetter(c) == true) {
                    nome[pos] = Character.toLowerCase(c);
                    pos++;
                    if (pos < tam) {
                        c = n.charAt(pos);
                    } else {
                        break;
                    }
                }
                if (pos < tam) {
                    nome[pos] = c;
                    pos++;
                }
            }
        }
        nova = new String(nome);
        return nova;
    }
    public static String retirarEspacos(String n) {
        int tam = n.length();
        char[] nome = new char[tam];
        int pos = 0, posVet = 0;
        char c;
        String nova;
        while (pos < tam) {
            // achar inicio de uma palavra
            c = n.charAt(pos);
            while (Character.isSpaceChar(c) == true) {
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
                    nome[posVet] = c;
                    pos++;
                    posVet++;
                    if (pos < tam) {
                        c = n.charAt(pos);
                    } else {
                        break;
                    }
                }
                if (pos < tam) {
                    nome[posVet] = c;
                    pos++;
                    posVet++;
                }
            }
        }
        nova = new String(nome);
        return nova;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        System.out.print("Informe o nome: ");
        nome = input.nextLine();
        
        while (validarNome(nome) == false) {
            System.out.print("Nome inválido. Digite apenas letras e espaços: ");
            nome = input.nextLine();
        }
        
        nome = formatarNome(nome);
        System.out.println("Nome formatado: " + nome);
    }
}