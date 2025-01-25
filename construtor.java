
class Main {
    public static void main(String[] args) {
      System.out.println("Funcionários");
  
     Funcionario funcionario1=new Funcionario("Eduardo Lopes", "111.111.111-11", "Rua Dr. Luis Alberto, 01", 1100);
      funcionario1.informacoes();
  
      Funcionario funcionario2=new Funcionario("Maria Cláudia", "222.222.222-22", "Rua Walter Cruz, 02", 1220);
      funcionario2.informacoes();
    }
  }