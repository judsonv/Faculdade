class Aluno{
    String nome;
    String numchamada;
    String serie;
    String datanasc;
    String endereco;
  
  public Aluno(String nome, String numchamada, String serie, String datanasc, String endereco){
    this.nome=nome;
    this.numchamada=numchamada;
    this.serie=serie;
    this.datanasc=datanasc;
    this.endereco=endereco;
  }
  
   void informacoes()
   {
   System.out.println("Nome= " + nome);
    System.out.println("Num Chamada= " + numchamada);
    System.out.println("Serie= " + serie);
    System.out.println("Data de nascimento= " +datanasc);
    System.out.println("Endereço= " + endereco);
  
   }
  }
  
  
