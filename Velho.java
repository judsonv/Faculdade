public class Velho extends Imovel{
    private double desconto;
  
  public Velho(double desconto, String endereco, double preco ){super(endereco, preco);{
    this.desconto=desconto;
  }
  }
  
  public void calcular(){
      double resultado = getPreco() - desconto;
      System.out.println("Valor Final: " + resultado );
  }
  
  }
  