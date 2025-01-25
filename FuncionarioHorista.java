public class FuncionarioHorista extends Funcionario{
    private double horasMensais;
    private double valorHora;
  
  public FuncionarioHorista(double horasMensais, double valorHora, String nome, String registro ){super(nome,registro);{
    this.horasMensais=horasMensais;
    this.valorHora=valorHora;
  }
  }
  
  public void calcularSalario(){
      double salarioFinal = horasMensais*valorHora ;
      System.out.println("Salário: " +salarioFinal );
  }
  
  }