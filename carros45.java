public class Cliente {
    private String nome;
    private int idade;
    private String cpf;
    private String email;
    private String endereco;
  
    
    public Cliente(String nome, int idade, String cpf, String email, String endereco)
    {
      this.nome=nome;
      this.idade=idade;
      this.cpf=cpf;
      this.email=email;
       this.endereco=endereco;
    }
    public String getNome(){
      return nome;
  
    }
    public void setNome (String nome){
      this.nome=nome;
  
    }
    public int getIdade(){
      return idade;
  
    }
    public void setIdade (int idade){
      this.idade=idade;
      
    }
  
    public String getCpf(){
      return cpf;
  
    }
    public void setCpf (String cpf){
      this.cpf=cpf;
      
    }
  
     public String getEmail(){
      return email;
  
    }
    public void setEmail (String email){
      this.email=email;
      
    }
  
    public String getEndereco(){
      return endereco;
  
    }
    public void setEndereco (String endereco){
      this.endereco=endereco;
      
    }
  
  void informacoes()
    
    {
      System.out.println(" Nome: " + getNome() + " Idade: " + getIdade() + " Cpf:  " + getCpf() + " Email: " + getEmail() + " Endereço: " + getEndereco());
    }
    
  }
  
