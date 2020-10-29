package projeto.circulo;

public class Circulo {
    private int x;
    private int y;
    private int raio;
    
    public Circulo (int x, int y, int r){  // Construtor
        this.x = x;
        this.y = y;
        this.raio = r;
    }
      private void setX(int novoX){
          x = novoX;
      }
      private int getX(){
            return x;
      }
      private void setY(int novoY){
          y = novoY;
      }
      private int getY(){
            return y;
      }
      private void setRaio(int novoR){
          raio = novoR;
      }
      private int getRaio(){
            return raio;
      }
        public double calcularArea(){
            return Math.PI * Math.pow(raio, 2);
        }
        public void calcularCircunferencia(){
            System.out.println("Cincunferência: " + 2 * Math.PI * raio);
        }
        public void distanciaEntre(Circulo outro){
            double soma = Math.pow(outro.x - this.x, 2) + Math.pow(outro.y - this.y, 2);
            double distancia = Math.sqrt(soma);
            System.out.println("Distância: " + distancia);
        }
}