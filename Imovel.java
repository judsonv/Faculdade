public class Imovel{
    private String endereco;
    private double preco;
  
    public Imovel(String endereco, double preco){
      this.endereco=endereco;
      this.preco=preco;
    }
  
    public double getPreco(){
      return preco;
    }
  
    public void imprimir(){
      System.out.println("Endereço:" + endereco);
      System.out.println("Preço:" + preco);
    }
  
  }