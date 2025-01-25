public class Pessoajuridica extends Cliente{
    private String razao_social;
    private String nome_fantasia;
    private String sigla;
    private String cnpj;
    public Pessoajuridica(String razao_social, String nome_fantasia, String sigla, String cnpj, String nome_pais, String data_cadastro){
      super(nome_pais, data_cadastro);
      this.razao_social=razao_social;
      this.nome_fantasia=nome_fantasia;
      this.sigla=sigla;
      this.cnpj=cnpj;
    }
  
    public String getRazao_social(){
      return razao_social;
    }
    public void setRazao_social(String razao_social){
      this.razao_social=razao_social;
    }
  
    public String getNome_fantasia(){
      return nome_fantasia;
    }
  
    
    public void setNome_fantasia(String nome_fantasia){
      this.nome_fantasia=nome_fantasia;
    }
  
   public String getSigla(){
      return sigla;
    }
    public void setSigla(String sigla){
      this.sigla=sigla;
    }
  
    public String getCnpj(){
      return cnpj;
    }
    public void setCnpj(String cpnj){
      this.cnpj=cnpj;
    }
  
    void informacoes()
    {
      System.out.println("Razão Social: " + getRazao_social() + "Nome Fantasia: " + getNome_fantasia() + "Sigla: " + getSigla() + "Cnpj:" + getCnpj() + "Nome dos pais: " + getNome_pais() + "Data de cadastro: " + getData_cadastro());
    }
  }