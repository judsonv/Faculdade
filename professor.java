class Professor{
    String nome;
    String disciplina;
    String telefone;
    String endereco;
    String idade;
  
    public Professor(String nome, String disciplina, String telefone, String endereco, String idade){
    this.nome=nome;
    this.idade=idade;
    this.disciplina=disciplina;
    this.telefone=telefone;
    this.endereco=endereco;
    this.idade=idade;
  }
  
   void informacoes2()
   {
    System.out.println("Nome= " + nome);
    System.out.println("Disciplina= "+ disciplina);
    System.out.println("Telefone= " + telefone);
    System.out.println("Endereco= " + endereco);
     System.out.println("Idade= " + idade);
   }
  }
  
  