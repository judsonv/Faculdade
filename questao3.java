class Main {
    public static void main(String[] args) {
  
      FuncionarioHorista fh1= new FuncionarioHorista(160, 40,"José", "200301" );
      
      FuncionarioMensalista fm1= new FuncionarioMensalista("Gerente", "Paulo", "200420");
  
      fh1.calcularSalario();
      fm1.calcularSalario();
    }
  }
  