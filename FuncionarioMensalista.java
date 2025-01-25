public class FuncionarioMensalista extends Funcionario{
    private String cargo;
  
  public FuncionarioMensalista(String cargo, String nome, String registro){ super(nome,registro);{
    this.cargo=cargo;
  }
  }
  
  public void calcularSalario(){
  
    if(cargo=="Vendedor"){
      
      System.out.println("Salário: 3000" );}
    else if (cargo=="Gerente"){
      System.out.println("Salário: 8000");
    }else{
      System.out.println("Cargo inválido!");
    }
  }
  
  }