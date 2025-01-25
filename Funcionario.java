public class Funcionario{
    private String nome;
    private String registro;
  
    public Funcionario(String nome, String registro){
      this.nome=nome;
      this.registro=registro;
    }
  
    
  
    public void imprimir(){
      System.out.println("Nome:" + nome);
      System.out.println("Registro:" + registro);
    }
  
  }
  
  