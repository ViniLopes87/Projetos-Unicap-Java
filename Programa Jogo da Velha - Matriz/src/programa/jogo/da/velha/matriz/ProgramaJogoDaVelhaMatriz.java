package programa.jogo.da.velha.matriz;

import java.util.Scanner;
import java.util.Random;

public class ProgramaJogoDaVelhaMatriz {
    public static boolean verJogada(char simbolo, int x, int y, char[][]mat){
       boolean vencedor = false;
        if(x==0 && y==0){
           if((mat[0][1] == (simbolo) && mat[0][2] == (simbolo)) ||
              (mat[1][0] == (simbolo) && mat[2][0] == (simbolo)) ||
              (mat[1][1] == (simbolo) && mat[2][2] == (simbolo))){
               vencedor = true;
           }
        }
        else if(x==0 && y==1){
           if((mat[0][0] == (simbolo) && mat[0][2] == (simbolo)) ||
              (mat[1][1] == (simbolo) && mat[2][1] == (simbolo))){
               vencedor = true;
           }
        }
        else if(x==0 && y==2){
           if((mat[0][1] == (simbolo) && mat[0][0] == (simbolo)) ||
              (mat[1][2] == (simbolo) && mat[2][2] == (simbolo)) ||
              (mat[1][1] == (simbolo) && mat[2][0] == (simbolo))){
               vencedor = true;
           }
        }
        else if(x==1 && y==0){
           if((mat[0][0] == (simbolo) && mat[2][0] == (simbolo)) ||
              (mat[1][1] == (simbolo) && mat[1][2] == (simbolo))){
               vencedor = true;
           }
        }
        else if(x==1 && y==1){
           if((mat[0][1] == (simbolo) && mat[2][1] == (simbolo)) ||
              (mat[1][0] == (simbolo) && mat[1][2] == (simbolo)) ||
              (mat[0][0] == (simbolo) && mat[2][2] == (simbolo)) ||
              (mat[0][2] == (simbolo) && mat[2][0] == (simbolo))){
               vencedor = true;
           }
        }
        else if(x==1 && y==2){
           if((mat[0][2] == (simbolo) && mat[2][2] == (simbolo)) ||
              (mat[1][1] == (simbolo) && mat[1][0] == (simbolo))){
               vencedor = true;
           }
        }
        else if(x==2 && y==0){
           if((mat[0][0] == (simbolo) && mat[1][0] == (simbolo)) ||
              (mat[2][1] == (simbolo) && mat[2][2] == (simbolo)) ||
              (mat[1][1] == (simbolo) && mat[0][2] == (simbolo))){
               vencedor = true;
           }
        }
        else if(x==2 && y==1){
           if((mat[2][0] == (simbolo) && mat[2][2] == (simbolo)) ||
              (mat[1][1] == (simbolo) && mat[0][1] == (simbolo))){
               vencedor = true;
           }
        }
        else if(x==2 && y==2){
           if((mat[2][1] == (simbolo) && mat[2][0] == (simbolo)) ||
              (mat[1][2] == (simbolo) && mat[0][2] == (simbolo)) ||
              (mat[1][1] == (simbolo) && mat[0][0] == (simbolo))){
               vencedor = true;
           }
        }
       return vencedor;
    }
    public static int PossibilidadeL(char simbolo, char[][]mat){
       int linha = 9;
           if((mat[0][1] == (simbolo) && mat[0][2] == (simbolo)) ||
              (mat[1][0] == (simbolo) && mat[2][0] == (simbolo)) ||
              (mat[1][1] == (simbolo) && mat[2][2] == (simbolo))){
               linha = 0;
           }
            else if((mat[0][0] == (simbolo) && mat[0][2] == (simbolo)) ||
              (mat[1][1] == (simbolo) && mat[2][1] == (simbolo))){
               linha = 0;
           }
            else if((mat[0][1] == (simbolo) && mat[0][0] == (simbolo)) ||
              (mat[1][2] == (simbolo) && mat[2][2] == (simbolo)) ||
              (mat[1][1] == (simbolo) && mat[2][0] == (simbolo))){
               linha = 0;
           }
            else if((mat[0][0] == (simbolo) && mat[2][0] == (simbolo)) ||
              (mat[1][1] == (simbolo) && mat[1][2] == (simbolo))){
               linha = 1;
           }
            else if((mat[0][1] == (simbolo) && mat[2][1] == (simbolo)) ||
              (mat[1][0] == (simbolo) && mat[1][2] == (simbolo)) ||
              (mat[0][0] == (simbolo) && mat[2][2] == (simbolo)) ||
              (mat[0][2] == (simbolo) && mat[2][0] == (simbolo))){
               linha = 1;
           }
            else if((mat[0][2] == (simbolo) && mat[2][2] == (simbolo)) ||
              (mat[1][1] == (simbolo) && mat[1][0] == (simbolo))){
               linha = 1;
           }
            else if((mat[0][0] == (simbolo) && mat[1][0] == (simbolo)) ||
              (mat[2][1] == (simbolo) && mat[2][2] == (simbolo)) ||
              (mat[1][1] == (simbolo) && mat[0][2] == (simbolo))){
               linha = 2;
           }
            else if((mat[2][0] == (simbolo) && mat[2][2] == (simbolo)) ||
              (mat[1][1] == (simbolo) && mat[0][1] == (simbolo))){
               linha = 2;
           }
            else if((mat[2][1] == (simbolo) && mat[2][0] == (simbolo)) ||
              (mat[1][2] == (simbolo) && mat[0][2] == (simbolo)) ||
              (mat[1][1] == (simbolo) && mat[0][0] == (simbolo))){
               linha = 2;
           }
       return linha;
    }
    public static int PossibilidadeC(char simbolo, char[][]mat){
        int coluna = 9;
           if((mat[0][1] == (simbolo) && mat[0][2] == (simbolo)) ||
              (mat[1][0] == (simbolo) && mat[2][0] == (simbolo)) ||
              (mat[1][1] == (simbolo) && mat[2][2] == (simbolo))){
               coluna = 0;
           }
           else if((mat[0][0] == (simbolo) && mat[0][2] == (simbolo)) ||
                  (mat[1][1] == (simbolo) && mat[2][1] == (simbolo))){
                   coluna = 1;
           }
           else if((mat[0][1] == (simbolo) && mat[0][0] == (simbolo)) ||
                  (mat[1][2] == (simbolo) && mat[2][2] == (simbolo)) ||
                  (mat[1][1] == (simbolo) && mat[2][0] == (simbolo))){
                   coluna = 2;
           }
           else if((mat[0][0] == (simbolo) && mat[2][0] == (simbolo)) ||
                  (mat[1][1] == (simbolo) && mat[1][2] == (simbolo))){
                   coluna = 0;
           }
           else if((mat[0][1] == (simbolo) && mat[2][1] == (simbolo)) ||
                  (mat[1][0] == (simbolo) && mat[1][2] == (simbolo)) ||
                  (mat[0][0] == (simbolo) && mat[2][2] == (simbolo)) ||
                  (mat[0][2] == (simbolo) && mat[2][0] == (simbolo))){
                   coluna = 1;
           }
           else if((mat[0][2] == (simbolo) && mat[2][2] == (simbolo)) ||
                  (mat[1][1] == (simbolo) && mat[1][0] == (simbolo))){
                   coluna = 2;
           }
           else if((mat[0][0] == (simbolo) && mat[1][0] == (simbolo)) ||
                  (mat[2][1] == (simbolo) && mat[2][2] == (simbolo)) ||
                  (mat[1][1] == (simbolo) && mat[0][2] == (simbolo))){
                   coluna = 0;
           }
           else if((mat[2][0] == (simbolo) && mat[2][2] == (simbolo)) ||
                  (mat[1][1] == (simbolo) && mat[0][1] == (simbolo))){
                   coluna = 1;
           }
           else if((mat[2][1] == (simbolo) && mat[2][0] == (simbolo)) ||
                  (mat[1][2] == (simbolo) && mat[0][2] == (simbolo)) ||
                  (mat[1][1] == (simbolo) && mat[0][0] == (simbolo))){
                   coluna = 2;
           }
       return coluna;
    }
    public static void Preencher1(char[][]mat, int valor, String nome){
        Scanner input = new Scanner(System.in);
        Random sorteio = new Random();
        int x,y,rodada = 0;
        String nomeV = "Computador";
        boolean vencedor = false;
        
        if(valor == 1){
            System.out.println("Quem irá começar é o computador");
        }
        else{
            System.out.println("Quem irá começar é o jogador " + nome);
        }
        while(vencedor == false && rodada < 9){
            if(valor == 1){
                int jogadaL = sorteio.nextInt(3);
                int jogadaC = sorteio.nextInt(3);
                
                while(mat[jogadaL][jogadaC] == 'X' || mat[jogadaL][jogadaC] == 'O'){
                       jogadaL = sorteio.nextInt(3);
                       jogadaC = sorteio.nextInt(3);       
                }
                
                    System.out.println("Jogada do computador:");
                    mat[jogadaL][jogadaC] = 'O';
                    rodada++;
                    if(vencedor = verJogada('O',jogadaL,jogadaC,mat)){
                        nomeV = "Computador";
                        vencedor = true;
                    }
                    valor--;
            }
            else{
                System.out.println(nome + " é sua vez");
                System.out.print("Informe a posição da linha que vai jogar: ");
                x = input.nextInt() - 1;
                
                while(x < 0 || x > 2){
                    System.out.println("Essa posição não existe");
                    System.out.print("Informe a posição da linha que vai jogar que esteja entre 1 e 3: ");
                    x = input.nextInt() - 1;
                }
                
                System.out.print("Informe a posição da coluna que vai jogar: ");
                y = input.nextInt() - 1;
                
                while(y < 0 || y > 2){
                    System.out.println("Essa posição não existe");
                    System.out.print("Informe a posição da coluna que vai jogar que esteja entre 1 e 3: ");
                    y = input.nextInt() - 1;
                }

                while(mat[x][y] == 'X' || mat[x][y] == 'O'){
                      System.out.println("Essa posição já foi preenchida"); 
                      System.out.print("Informe a posição da linha que vai jogar: ");
                      x = input.nextInt() - 1;
                      System.out.print("Informe a posição da coluna que vai jogar: ");
                      y = input.nextInt() - 1;       
                }
                
                    System.out.println("Jogada de " + nome + ":");
                    mat[x][y] = 'X';
                    rodada++;
                    if(vencedor = verJogada('X',x,y,mat)){
                        nomeV = nome;
                        vencedor = true;
                    }
                    valor++;
            }
            for(int L = 0;L < mat.length;L++){
                for(int C = 0;C < mat[L].length;C++){
                    System.out.print(mat[L][C] + " ");
                }
                System.out.println();
            }
        }     
                if(vencedor){
                    System.out.println("O jogador " + nomeV + " foi o vencedor");
                }
                else{
                    System.out.println("Jogo terminou empatado");
                }
                
                for(int L = 0;L < mat.length;L++){
                    for(int C = 0;C < mat[L].length;C++){
                        mat[L][C] = '-';
                    }
                }    
    }
    public static void Preencher2(char[][]mat, int valor, String nome){
        Scanner input = new Scanner(System.in);
        Random sorteio = new Random();
        int x,y,rodada = 0,PLC,PCC,PLH,PCH;
        String nomeV = "Computador";
        boolean vencedor = false;
        
        if(valor == 1){
            System.out.println("Quem irá começar é o computador");
        }
        else{
            System.out.println("Quem irá começar é o jogador " + nome);
        }
        while(vencedor == false && rodada < 9){
            if(valor == 1){
                PLC = PossibilidadeL('O',mat);
                PCC = PossibilidadeC('O',mat);
                PLH = PossibilidadeL('X',mat) - 1;
                PCH = PossibilidadeC('X',mat) - 1;
                if(PLC != 9 && PCC != 9){
                    System.out.println("OI");
                    
                    while(mat[PLC][PCC] == 'X' || mat[PLC][PCC] == 'O'){
                        PLC = sorteio.nextInt(3);
                        PCC = sorteio.nextInt(3);       
                    }
                    
                    System.out.println("Jogada do computador:");
                    mat[PLC][PCC] = 'O';
                    rodada++;
                    if(vencedor = verJogada('O',PLC,PCC,mat)){
                        nomeV = "Computador";
                        vencedor = true;
                    }
                    valor--;
                }
                else if(PLH != 8 && PCH != 8){
                    System.out.println("XAU");
                    System.out.println("Jogada do computador:");
                    mat[PLH + 1][PCH + 1] = 'O';
                    rodada++;
                    valor--;
                }
                else{
                    int jogadaL = sorteio.nextInt(3);
                    int jogadaC = sorteio.nextInt(3);
                
                    while(mat[jogadaL][jogadaC] == 'X' || mat[jogadaL][jogadaC] == 'O'){
                        jogadaL = sorteio.nextInt(3);
                        jogadaC = sorteio.nextInt(3);       
                    }
                
                        System.out.println("Jogada do computador:");
                        mat[jogadaL][jogadaC] = 'O';
                        rodada++;
                        if(vencedor = verJogada('O',jogadaL,jogadaC,mat)){
                            nomeV = "Computador";
                            vencedor = true;
                        }
                        valor--;
                }
            }
            else{
                System.out.println(nome + " é sua vez");
                System.out.print("Informe a posição da linha que vai jogar: ");
                x = input.nextInt() - 1;
                
                while(x < 0 || x > 2){
                    System.out.println("Essa posição não existe");
                    System.out.print("Informe a posição da linha que vai jogar que esteja entre 1 e 3: ");
                    x = input.nextInt() - 1;
                }
                
                System.out.print("Informe a posição da coluna que vai jogar: ");
                y = input.nextInt() - 1;
                
                while(y < 0 || y > 2){
                    System.out.println("Essa posição não existe");
                    System.out.print("Informe a posição da coluna que vai jogar que esteja entre 1 e 3: ");
                    y = input.nextInt() - 1;
                }

                while(mat[x][y] == 'X' || mat[x][y] == 'O'){
                      System.out.println("Essa posição já foi preenchida"); 
                      System.out.print("Informe a posição da linha que vai jogar: ");
                      x = input.nextInt() - 1;
                      System.out.print("Informe a posição da coluna que vai jogar: ");
                      y = input.nextInt() - 1;       
                }
                
                    System.out.println("Jogada de " + nome + ":");
                    mat[x][y] = 'X';
                    rodada++;
                    if(vencedor = verJogada('X',x,y,mat)){
                        nomeV = nome;
                        vencedor = true;
                    }
                    valor++;
            }
            for(int L = 0;L < mat.length;L++){
                for(int C = 0;C < mat[L].length;C++){
                    System.out.print(mat[L][C] + " ");
                }
                System.out.println();
            }
        }     
                if(vencedor){
                    System.out.println("O jogador " + nomeV + " foi o vencedor");
                }
                else{
                    System.out.println("Jogo terminou empatado");
                }
                
                for(int L = 0;L < mat.length;L++){
                    for(int C = 0;C < mat[L].length;C++){
                        mat[L][C] = '-';
                    }
                }    
    }
    public static void Preencher3(char[][]mat, int valor, String nome1,String nome2){
        Scanner input = new Scanner(System.in);
        int x,y,rodada = 0;
        String nomeV = "Computador";
        boolean vencedor = false;
        
        if(valor == 1){
            System.out.println("Quem irá começar é o jogador " + nome2);
        }
        else{
            System.out.println("Quem irá começar é o jogador " + nome1);
        }
        while(vencedor == false && rodada < 9){
            if(valor == 1){
                System.out.println(nome2 + " é sua vez");
                System.out.print("Informe a posição da linha que vai jogar: ");
                x = input.nextInt() - 1;
                
                while(x < 0 || x > 2){
                    System.out.println("Essa posição não existe");
                    System.out.print("Informe a posição da linha que vai jogar que esteja entre 1 e 3: ");
                    x = input.nextInt() - 1;
                }
                
                System.out.print("Informe a posição da coluna que vai jogar: ");
                y = input.nextInt() - 1;
                
                while(y < 0 || y > 2){
                    System.out.println("Essa posição não existe");
                    System.out.print("Informe a posição da coluna que vai jogar que esteja entre 1 e 3: ");
                    y = input.nextInt() - 1;
                }
                
                while(mat[x][y] == 'X' || mat[x][y] == 'O'){
                      System.out.println("Essa posição já foi preenchida"); 
                      System.out.print("Informe a posição da linha que vai jogar: ");
                      x = input.nextInt() - 1;
                      System.out.print("Informe a posição da coluna que vai jogar: ");
                      y = input.nextInt() - 1;       
                }
                
                    System.out.println("Jogada de " + nome2 + ":");
                    mat[x][y] = 'O';
                    rodada++;
                    if(vencedor = verJogada('O',x,y,mat)){
                        nomeV = nome2;
                        vencedor = true;
                    }
                    valor--;
            }
            else{
                System.out.println(nome1 + " é sua vez");
                System.out.print("Informe a posição da linha que vai jogar: ");
                x = input.nextInt() - 1;
                
                while(x < 0 || x > 2){
                    System.out.println("Essa posição não existe");
                    System.out.print("Informe a posição da linha que vai jogar que esteja entre 1 e 3: ");
                    x = input.nextInt() - 1;
                }
                
                System.out.print("Informe a posição da coluna que vai jogar: ");
                y = input.nextInt() - 1;
                
                while(y < 0 || y > 2){
                    System.out.println("Essa posição não existe");
                    System.out.print("Informe a posição da coluna que vai jogar que esteja entre 1 e 3: ");
                    y = input.nextInt() - 1;
                }
                
                while(mat[x][y] == 'X' || mat[x][y] == 'O'){
                      System.out.println("Essa posição já foi preenchida"); 
                      System.out.print("Informe a posição da linha que vai jogar: ");
                      x = input.nextInt() - 1;
                      System.out.print("Informe a posição da coluna que vai jogar: ");
                      y = input.nextInt() - 1;       
                }
                
                    System.out.println("Jogada de " + nome1 + ":");
                    mat[x][y] = 'X';
                    rodada++;
                    if(vencedor = verJogada('X',x,y,mat)){
                        nomeV = nome1;
                        vencedor = true;
                    }
                    valor++;
            }
            for(int L = 0;L < mat.length;L++){
                for(int C = 0;C < mat[L].length;C++){
                    System.out.print(mat[L][C] + " ");
                }
                System.out.println();
            }
        }      
                if(vencedor){
                    System.out.println("O jogador " + nomeV + " foi o vencedor");
                }
                else{
                    System.out.println("Jogo terminou empatado");
                }
                
                for(int L = 0;L < mat.length;L++){
                    for(int C = 0;C < mat[L].length;C++){
                        mat[L][C] = '-';
                    }
                }    
    }
    public static void TI(){
        System.out.println("Jogo da Velha");
        System.out.println("1 - Jogar");
        System.out.println("0 - Sair");
        System.out.print("Digite sua opção: ");
    }
    public static void TP(){
        System.out.println("Jogo da Velha");
        System.out.println("1 - Um jogador");
        System.out.println("2 - Dois jogadores");
        System.out.print("Digite sua opção: ");
    }
    public static void TN(){
        System.out.println("Nível do jogo:");
        System.out.println("1 - Fácil");
        System.out.println("2 - Difícil");
        System.out.print("Digite sua opção: ");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random sorteio = new Random();
        int OP;
        String nome1,nome2;
        
        char[][]Matriz;
        Matriz = new char[3][3];
        
        for(int L = 0;L < Matriz.length;L++){
            for(int C = 0;C < Matriz[L].length;C++){
                Matriz[L][C] = '-';
            }
        }
        
      do{
        TI();
        OP = input.nextInt();
        
        while(OP < 0 || OP > 1){
            System.out.println("Opção inválida, informe a opção com 1 ou 2");
            TI();
            OP = input.nextInt();
        }
        
        if(OP == 1){
            TP();
            OP = input.nextInt(); input.nextLine();
            
            while(OP < 1 || OP > 2){
                System.out.println("Opção inválida, informe a opção com 1 ou 2");
                TP();
                OP = input.nextInt(); input.nextLine();
            }
            
            if(OP == 1){
                System.out.print("Informe o nome do jogador humano: ");
                nome1 = input.nextLine();
                TN();
                OP = input.nextInt(); input.nextLine();
                
                while(OP < 1 || OP > 2){
                    System.out.println("Opção inválida, informe a opção com 1 ou 2");
                    TN();
                    OP = input.nextInt(); input.nextLine();
                }
                
                if(OP == 1){
                    System.out.println("X - " + nome1);
                    System.out.println("O - Computador");
                    int valor = sorteio.nextInt(2);
                    System.out.println(valor);
                    Preencher1(Matriz,valor,nome1);
                }
                else{
                    System.out.println("X - " + nome1);
                    System.out.println("O - Computador");
                    int valor = sorteio.nextInt(2);
                    Preencher2(Matriz,valor,nome1);
                }
            }
            else{
                System.out.print("Informe o nome do 1º jogador humano: ");
                nome1 = input.nextLine();
                System.out.print("Informe o nome do 2º jogador humano: ");
                nome2 = input.nextLine();
                System.out.println("X - " + nome1);
                System.out.println("O - " + nome2);
                int valor = sorteio.nextInt(2);
                Preencher3(Matriz,valor,nome1,nome2);
            }
        }
        else{
            System.out.println("GAME OVER");
        }
      }while(OP != 0);
    }   
}