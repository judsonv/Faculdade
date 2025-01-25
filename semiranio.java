class Main {
    public static void main(String[] args) {
      System.out.println ("ALUNOS");
  
      Aluno aluno1=new Aluno("João", "20", "8", "01/10/2007", "Rua Projetada Y, 99, Centro");
  
      Aluno aluno2=new Aluno("Lucas", "19", "8", "01/10/2005", "Rua Projetada Y, 79, Centro");
  
      aluno1.informacoes();
      aluno2.informacoes();
  
      System.out.println ("PROFESSORES");
  
      Professor professor1=new Professor("Caetano", "Geografia","99 9 99999999", "Rua Projetada Y, 99, Centro", "40");
      Professor professor2=new Professor("Cláudio", "História","44 9 99999999", "Rua Projetada A, 29, Centro", "47");
  
      professor1.informacoes2();
      professor2.informacoes2();
    }
  }
  
  
  
  