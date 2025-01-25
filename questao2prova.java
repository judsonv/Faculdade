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
       System.out.println("Placa: \n" + getPlaca());
       System.out.println("Modelo: \n" + getModelo());
       System.out.println("Ano: \n" + getAno());
       System.out.println("Cor: \n" + getCor());
       System.out.println("Diária: \n" + getDiaria());
    }
    
  
    
    }