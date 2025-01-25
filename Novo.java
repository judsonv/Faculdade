public class Novo extends Imovel{
    private double adicional;
  
  public Novo(double adicional, String endereco, double preco ){super(endereco, preco);{
    this.adicional=adicional;
  }
  }
  
  public void calcular(){
      double resultado = getPreco() + adicional;
      System.out.println("Valor Final: " + resultado );
  }
  }