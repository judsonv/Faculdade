class Main {
    public static void main(String[] args) {
    System.out.println("Filmes cadastrados");
    Filme filme1= new Filme("ocontador", "Gavin O'Connor","150 minutos", 2019);
  
    filme1.informacoes();
    filme1.setTitulo("O contador");
    if(filme1.getTitulo().length() >=20){
      System.out.println("Titulo Grande");
    }else{
      System.out.println("Titulo pequeno");
    }
  
    filme1.informacoes();
  
    Filme filme2= new Filme("O atirador", "Mark Walkeberg", "250 minutos", 2009);
    if(filme2.getAno()<2011){
      filme2.setAno(2011);
    }
  
   filme2.informacoes();
    }
  }
