package projeto.data.objeto;

public class Data {
   private int dia;
   private int mes;
   private int ano;
   
   public Data(int d,int m, int a){
       
       if(validarAno(a) && validarMes(m) && validarDia(d,m,a)){
       dia = d;
       mes = m;
       ano = a;
       }
       else{
           dia = 1;
           mes = 1;
           ano = 1;
       }
   }
   private boolean validarDia(int d,int m,int a){
       if(a % 400 == 0 || a % 4 == 0 && a % 100 != 0){    // Para ver se é bissexto
            if(m == 2){
               if(d >= 1 && d <= 29){
                   return true;
               }
               else{
                   return false;
               }
            }
            else if(m == 4 || m == 6 || m == 9 || m == 11){
                if(d >= 1 && d <= 30){
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                if(d >= 1 && d <= 31){
                    return true;
                }
                else{
                    return false;
                }
            }
       }
       else{ // Para ver se não é bissexto
           if(m == 2){
               if(d >= 1 && d <= 28){
                   return true;
               }
               else{
                   return false;
               }
            }
            else if(m == 4 || m == 6 || m == 9 || m == 11){
                if(d >= 1 && d <= 30){
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                if(d >= 1 && d <= 31){
                    return true;
                }
                else{
                    return false;
                }
            }
       }      
   }
   
   private boolean validarMes(int m){
       if(m >= 1 && m <= 12){
           return true;
       }
       else{
           return false;
       }
   }
   
   private boolean validarAno(int a){
       if(a >= 1){
           return true;
       }
       else{
           return false;
       }
   }
   
   private void setDia(int d){
       dia = d;
   }
   private int getDia(){
       return dia;
   }
   private void setMes(int m){
       mes = m;
   }
   private int getMes(){
       return mes;
   }
   private void setAno(int a){
       ano = a;
   }
   private int getAno(){
       return ano;
   }
   public void verData(){
       int D = getDia();
       int M = getMes();
       int A = getAno();
       System.out.println(D + "/" + M + "/" + A);
       switch (M) {
           case 1:
               System.out.println(D + " de " + "Janeiro" + " de " + A);
               break;
           case 2:
               System.out.println(D + " de " + "Fevereiro" + " de " + A);
               break;
           case 3:
               System.out.println(D + " de " + "Março" + " de " + A);
               break;
           case 4:
               System.out.println(D + " de " + "Abril" + " de " + A);
               break;
           case 5:
               System.out.println(D + " de " + "Maio" + " de " + A);
               break;
           case 6:
               System.out.println(D + " de " + "Junho" + " de " + A);
               break;
           case 7:
               System.out.println(D + " de " + "Julho" + " de " + A);
               break;
           case 8:
               System.out.println(D + " de " + "Agosto" + " de " + A);
               break;
           case 9:
               System.out.println(D + " de " + "Setembro" + " de " + A);
               break;
           case 10:
               System.out.println(D + " de " + "Outubro" + " de " + A);
               break;
           case 11:
               System.out.println(D + " de " + "Novembro" + " de " + A);
               break;
           default: 
               System.out.println(D + " de " + "Dezembro" + " de " + A);
               break;
       }
   }
   public static int Difmes(int mes,int dia){
       if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 && dia > 0 && dia <= 31){
           return 1;
       }
       else if(mes == 4 || mes == 2 || mes == 6 || mes == 9 || mes == 11 && dia > 0 && dia <= 30){
           return 2;
       }
       else{
           return 0;
       }
   }
   public void aumentar(int valor){
       int novoDia;
       int atualDia;
       int novoMes;
       int atualMes;
       int novoAno;
       int atualAno;
       atualDia = getDia();
       atualMes = getMes();
       atualAno = getAno();
       while(valor > 0){
           dia = dia + 1;
           valor = valor - 1;
           if(dia == 30 && valor > 0 && mes != 12 && Difmes(mes,dia) == 2){
               dia = 1;
               mes = mes + 1;
           }
           else if(dia == 31 && valor > 0 && mes != 12 && Difmes(mes,dia) == 1){
               dia = 1;
               mes = mes + 1;
           }
           else if(dia == 31 && valor > 0 && mes == 12 && Difmes(mes,dia) == 1){
               dia = 1;
               mes = 1;
               ano = ano + 1;
           }
       }
       setDia(dia);
       setMes(mes);
       setAno(ano);
   }
   public void distancia(int novoDia,int novoMes,int novoAno){
       int num = 0;
       int atualMes;
       int atualAno;
       int atualDia;
       atualDia = getDia();
       atualAno = getAno();
       atualMes = getMes();
       
       while(dia != novoDia || mes != novoMes || ano != novoAno){
           dia = dia + 1;
           num = num + 1;
           if(dia == 30 && mes != 12 && Difmes(mes,dia) == 2){
               dia = 1;
               mes = mes + 1;
           }
           else if(dia == 31 && mes != 12 && Difmes(mes,dia) == 1){
               dia = 1;
               mes = mes + 1;
           }
           else if(dia == 31 && mes == 12 && Difmes(mes,dia) == 1){
               dia = 1;
               mes = 1;
               ano = ano + 1;
           }
       }
       setDia(atualDia);
       setMes(atualMes);
       setAno(atualAno);
       System.out.println("A diferença de " + dia + "/" + mes + "/" + ano + " para " + novoDia+ "/" + novoMes + "/" + novoAno + " é de " + num + " dias");
   }
}