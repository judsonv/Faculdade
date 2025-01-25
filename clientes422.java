public class Cliente{
    private String nome_pais;
    private String data_cadastro;
    
    public Cliente(String nome_pais,String data_cadastro)
    {
      this.nome_pais=nome_pais;
      this.data_cadastro=data_cadastro;
    }
    public String getNome_pais(){
      return nome_pais;
  
    }
    public void setNome_pais (String nome_pais){
      this.nome_pais=nome_pais;
  
    }
    public String getData_cadastro(){
      return data_cadastro;
  
    }
    public void setData_castro (String data_cadastro){
      this.data_cadastro=data_cadastro;
      
    }
  void informacoes(){
    System.out.println ("Nome dos pais: " + getNome_pais() + "Data de cadastro: " + getData_cadastro());
  }
  
  }