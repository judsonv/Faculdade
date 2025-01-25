public class Aluno extends Pessoa{
    private String curso;
    public Aluno(String curso, String nome, int idade){
      super(nome, idade);
      this.curso=curso;
    }
    public String getCurso(){
      return curso;
    }
    public void setCurso(String curso){
      this.curso=curso;
    }
  
    void informacoes(){
      System.out.println("Nome: " + getNome() + "Idade: " + getIdade() + "Curso: " + curso);
    }
  }