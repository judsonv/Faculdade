
class Main {
    public static void main(String[] args) {
      Carro c1=new Carro("Fusion", "Xtreme", 2000 , "Ford" , "Gasolina");
       c1.informacoes();
      Carro c2=new Carro("Gol", "G5", 2005 , "Volkswagen" , "Alcool");
      c2.informacoes();
      Carro c3=new Carro("L1", "Deluxe", 2013, "Lanborghini", "Diesel");
      c3.informacoes();
      
  
  
      Cliente cl1=new Cliente("João da Silva", 40, "123456987-74", "joao@joao.com.br", "R Wxy, 99, Centro");
       cl1.informacoes();
  
      Cliente cl2=new Cliente("Paulo Ferreira", 44, "123457387-74", "paulo@paulo.com", "R Kiy, 97, Planalto");
       cl2.informacoes();
    }
  }
  