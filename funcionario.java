class Funcionario{
    String nome;
    String cpf;
    String endereco;
    double salario;
  
  public Funcionario (String nome, String cpf, String endereco, double salario){
    this.nome=nome;
    this.cpf=cpf;
    this.endereco=endereco;
    this.salario=salario;
  }
  void informacoes(){
    System.out.println("Nome "+nome);
    System.out.println("CPF "+cpf);
    System.out.println("Endereço "+endereco);
    System.out.println("Salário "+salario);
  }
  }
