class Main {
    public static void main(String[] args) {
      System.out.println("Clientes");{
        Cliente cliente1=new Cliente(04, "Joao da Silva", 11222333446);
  
        cliente1.informacoes();
  
        
        if(cliente1.getCpf().length() ==11){
      System.out.println("Cpf válido sem letras");
    }else{
      System.out.println("Esse Cpf possui letras!");
    }
  
     cliente1.informacoes();
  
      }
    }
  }