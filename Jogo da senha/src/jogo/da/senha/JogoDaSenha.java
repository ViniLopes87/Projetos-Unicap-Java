package jogo.da.senha;

import java.security.SecureRandom;
import java.util.Scanner;

public class JogoDaSenha {
    public static void main(String[] args) {
        
        SecureRandom rand = new SecureRandom();
        Scanner input = new Scanner(System.in);
        int P,D,T,cont2,resp;
        int sorteado ;
       
        
        System.out.println("JOGO DA SENHA");
        System.out.println("1 - Jogar");
        System.out.println("2 - Sair");
        System.out.print("Opção: ");
        resp = input.nextInt();
        
            while(resp != 1 && resp != 2){
               System.out.println("Resposta inválida");
               System.out.println("JOGO DA SENHA");
               System.out.println("1 - Jogar");
               System.out.println("2 - Sair");
               System.out.print("Opção: ");
               resp = input.nextInt();           
            }
        
        while(resp == 1){
            T = 1;
            cont2 = 0;
            sorteado = rand.nextInt(100) + 1;           
            System.out.println("Digite 1 - Para nível 1 (Fácil - 10 tentativas)");
            System.out.println("Digite 2 - Para nível 2 (Médio - 8 tentativas)");
            System.out.println("Digite 3 - Para nível 3 (Difícil - 5 tentativas)");
            System.out.print("Selecione o nível de dificuldade: ");
            D = input.nextInt();
            
            while(D != 1 && D != 2 && D != 3){
                System.out.println("Nível inválido");
                System.out.println("Digite 1 - Para nível 1 (Fácil - 10 tentativas)");
                System.out.println("Digite 2 - Para nível 2 (Médio - 8 tentativas)");
                System.out.println("Digite 3 - Para nível 3 (Difícil - 5 tentativas)");
                System.out.print("Selecione o nível de dificuldade: ");
                D = input.nextInt();
            }
        
            System.out.print("Digite um número entre 1 a 100: ");
            P = input.nextInt();
               
        while(D == 1 && T != 10){
            
            while(P < 1 || P > 100){
                System.out.println("Palpite inválido");
                System.out.print("Digite um número entre 1 a 100: ");
                P = input.nextInt();
            }
             
             T = T + 1;
             cont2 = cont2 + 1;
             
           if(P == sorteado){
               T = 10;
               System.out.println("Parabéns! Você acertou com " + cont2 + " tentativas");
           }
           else if(P > sorteado){
               System.out.println("Tente outra vez. Informe um valor menor que " + P);
               System.out.print("Digite um número: ");
               P = input.nextInt();   
           }
           else if(P + 1 == sorteado || P - 1 == sorteado ){
               System.out.println("Você está QUENTE!");
               System.out.print("Digite um número: ");
               P = input.nextInt();
               }
           else{  
               System.out.println("Tente outra vez. Informe um valor maior que " + P);
               System.out.print("Digite um número: ");
               P = input.nextInt();  
           }
        } 
        
           if(T == 10 && P != sorteado){     
              System.out.println("Infelizmente, você não conseguiu acertar a senha");
           }
               
        while(D == 2 && T != 8){
            
            while(P < 1 || P > 100){
                System.out.println("Palpite inválido");
                System.out.print("Digite um número entre 1 a 100: ");
                P = input.nextInt();
            }
            
             T = T + 1;
             cont2 = cont2 + 1;
             
           if(P == sorteado){
               T = 8;
               System.out.println("Parabéns! Você acertou com " + cont2 + " tentativas");
           }
           else if(P > sorteado){
               System.out.println("Tente outra vez. Informe um valor menor que " + P);
               System.out.print("Digite um número: ");
               P = input.nextInt();
           }
           else if(P + 1 == sorteado || P - 1 == sorteado ){
               System.out.println("Você está QUENTE!");
               System.out.print("Digite um número: ");
               P = input.nextInt();
           }
           else{  
               System.out.println("Tente outra vez. Informe um valor maior que " + P);
               System.out.print("Digite um número: ");
               P = input.nextInt();  
           }
           
           if(T == 8 && P != sorteado){     
            System.out.println("Infelizmente, você não conseguiu acertar a senha");
           }
        }
        
        while(D == 3 && T != 5){
            
            while(P < 1 || P > 100){
                System.out.println("Palpite inválido");
                System.out.print("Digite um número entre 1 a 100: ");
                P = input.nextInt();
            }
            
             T = T + 1;
             cont2 = cont2 + 1;
             
           if(P == sorteado){
               T = 5;
               System.out.println("Parabéns! Você acertou com " + cont2 + " tentativas");
           }
           else if(P > sorteado){
               System.out.println("Tente outra vez. Informe um valor menor que " + P);
               System.out.print("Digite um número: ");
               P = input.nextInt();
           }
           else if(P + 1 == sorteado || P - 1 == sorteado ){
               System.out.println("Você está QUENTE!");
               System.out.print("Digite um número: ");
               P = input.nextInt();
           }
           else{  
               System.out.println("Tente outra vez. Informe um valor maior que " + P);
               System.out.print("Digite um número: ");
               P = input.nextInt();  
           }
           
           if(T == 5 && P != sorteado){     
            System.out.println("Infelizmente, você não conseguiu acertar a senha");
           } 
        }
               System.out.println("JOGO DA SENHA");
               System.out.println("1 - Jogar");
               System.out.println("2 - Sair");
               System.out.print("Opção: ");
               resp = input.nextInt();
               
           while(resp != 1 && resp != 2){
               System.out.println("Resposta inválida");
               System.out.println("JOGO DA SENHA");
               System.out.println("1 - Jogar");
               System.out.println("2 - Sair");
               System.out.print("Opção: ");
               resp = input.nextInt();           
           }           
        }
    }
}