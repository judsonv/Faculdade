public class Carro {
    private String nome;
    private String modelo;
    private int ano;
    private String marca;
    private String combustivel;
  
  
    public Carro(String nome, String modelo, int ano, String marca, String combustivel)
    
    {
      this.nome=nome;
      this.modelo=modelo;
      this.ano=ano;
      this.marca=marca;
      this.combustivel=combustivel;
      
    }
    public String getNome(){
      return nome;
  
    }
    public void setNome (String nome){
      this.nome=nome;
  
    }
    public String getModelo(){
      return modelo;
  
    }
    public void setModelo (String modelo){
      this.modelo=modelo;
      
    }
  
    
    public int getAno(){
      return ano;
  
    }
    public void setAno (int ano){
      this.ano=ano;
  
    }
    public String getMarca(){
      return marca;
  
    }
    public void setMarca (String marca){
      this.marca=marca;
      
    }
    public String getCombustivel(){
      return combustivel;
  
    }
    public void setCombustivel (String combustivel){
      this.combustivel=combustivel;
      
    }
  
    void informacoes()
    
    {
      System.out.println(" Nome: " + getNome( ) + " Modelo: " + getModelo( ) + " Ano " + getAno( ) + " Marca: " + getMarca( ) + " Combustível " + getCombustivel( ));
    }
   
  }
  