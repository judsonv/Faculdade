public class esportivo extends veiculo{
    private int velocidade;
  
    public esportivo(int velocidade, String placa, String modelo, int ano, String cor, double diaria)
  
    {
      super( placa, modelo, ano, cor, diaria);
  
      this.velocidade=velocidade;
    }
    
    public int getVelocidade(){
      return velocidade;
  
    }
    public void setVelocidade (int velocidade){
      this.velocidade=velocidade;
    }
   void informacoes(){
      System.out.println("Velocidade: " + getVelocidade() + "Placa: " + getPlaca() + "Modelo: " + getModelo() + "Ano: " + getAno() + "Cor: " + getCor() + "Diaria" + getDiaria() );
    }
    
    }