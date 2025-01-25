public class utilitario extends veiculo{
    private int passageiros;
  
    public utilitario(int passageiros, String placa, String modelo, int ano, String cor, double diaria)
  
    {
      super(placa, modelo, ano, cor, diaria);
      this.passageiros=passageiros;
    }
    public int getPassageiros(){
      return passageiros;
  
    }
    public void setPassageiros (int passageiros){
      this.passageiros=passageiros;
    }
    void informacoes(){
      System.out.println("Passageiros " + getPassageiros() + "Placa: " + getPlaca() + "Modelo: " + getModelo() + "Ano: " + getAno() + "Cor: " + getCor() + "Diaria" + getDiaria() );
    }
    
  
    
    }