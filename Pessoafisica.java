public class Pessoafisica extends Cliente{
    private String nome;
    private String sobrenome;
    private String cpf;
    public Pessoafisica(String nome, String sobrenome, String cpf, String nome_pais, String data_cadastro)
    {
      super(nome_pais, data_cadastro);
      this.nome=nome;
      this.sobrenome=sobrenome;
      this.cpf=cpf;
    }
  
    public String getNome(){
      return nome;
    }
    public void setNome(String nome){
      this.nome=nome;
    }
  
    public String getSobrenome(){
      return sobrenome;
    }
    public void setCurso(String sobrenome){
      this.sobrenome=sobrenome;
    }
  
    public String getCpf(){
      return cpf;
    }
    public void setCpf(String cpf){
      this.cpf=cpf;
    }
  
    void informacoes(){
      System.out.println("Nome: " + getNome() + "Sobrenome: " + getSobrenome() + "Cpf: " + getCpf () + "Nome dos pais: " + getNome_pais() + "Data de cadastro: " + getData_cadastro());
    }
  }
  
  