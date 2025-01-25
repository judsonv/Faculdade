public class Professor extends Pessoa{
    private String formacao;
    public Professor(String formacao, String nome, int idade){
      super(nome, idade);
      this.formacao=formacao;
      
    }
   public String getFormacao(){
       return formacao;
     }
     public void setFormacao(String formacao){
       this.formacao=formacao;
     }
     void informacoes()
     {
       System.out.println("Nome: " + getNome() + "Idade: " + getIdade() + "Formacao: "+ formacao);
     }
   }
