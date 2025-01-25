
class Main {
    public static void main(String[] args) {
      System.out.println("CARROS CADASTRADOS");
    
  
    Carro fusion=new Carro();
    fusion.nome="Fusion X";
    fusion.marca="Ford";
    fusion.modelo="X 2020";
    fusion.placa="AAA3G99";
  
    System.out.println("Nome=" + fusion.nome);
    System.out.println("Marca=" + fusion.marca);
    System.out.println("Modelo=" + fusion.modelo);
    System.out.println("Placa=" + fusion.placa);
  
    Cliente cliente2=new Cliente();
    cliente2.nome= "Joao";
    cliente2.idade= 25;
    cliente2.cpf= "11122266632";
    cliente2.telefone= "99999999999";
    cliente2.endereco= "rua jk, 22, centro";
  
    System.out.println("Nome=" + cliente2.nome);
    System.out.println("Idade=" + cliente2.idade);
    System.out.println("Cpf=" + cliente2.cpf);
    System.out.println("Telefone=" + cliente2.telefone);
    System.out.println("Endereco=" + cliente2.endereco);
  
    }
  }
  
  
  
  