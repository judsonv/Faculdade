public class veiculo{
    private String placa;
    private String modelo;
    private int ano;
    private String cor;
    private double diaria;
    public veiculo(String placa, String modelo, int ano, String cor, double diaria)
  
    {
      this.placa=placa;
      this.modelo=modelo;
      this.ano=ano;
      this.cor=cor;
      this.diaria=diaria;
    }
  
    public String getPlaca(){
      return placa;
    }
    
    public void setPlaca(String placa){
      this.placa=placa;
    }
  
  
    public String getModelo(){
      return modelo;
    }
    
    public void setModelo (String modelo){
      this.modelo=modelo;
    }
  
     public int getAno){
      return ano;
    }
    
    public void setAno (int ano){
      this.ano=ano;
    }
  
    public String getCor){
      return cor;
    }
    
    public void setCor(String cor){
      this.cor=cor;
    }
  
    public Double getDiaria){
      return diaria;
    }
    
    public void setDiaria(Doublecor){
      this.diaria=diaria;
    }
    void informacoes(){
      System.out.println("Placa: " + getPlaca() + "Modelo: " + getModelo() + "Ano: " + getAno() + "Cor: " + getCor() + "Diaria" + getDiaria());
    }
  }
  
  
  
  
    
  
  