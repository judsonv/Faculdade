public class Cliente{
    int cod_cliente;
    String Nome_completo;
    int Cpf;
     
     public Cliente(int cod_cliente, String Nome_completo, int Cpf){
       this.cod_cliente=cod_cliente;
       this.Nome_completo=Nome_completo;
       this.Cpf=Cpf;
     }
  
      public String getNome_completo() {
          return Nome_completo;
      }
  
      public void setNome_completo(String Nome_completo) {
          this.Nome_completo=Nome_completo;
      }
  
      public int Cpf() {
          return Cpf;
      }
  
      public void setCpf(int Cpf) {
          this.Cpf=Cpf;
      }
  
      public int getcod_cliente() {
          return cod_cliente;
      }
  
     public void informacoes(){
          System.out.println("Codigo do cliente= "+ cod_cliente);
          System.out.println("Nome completo= "+ Nome_completo);
          System.out.println("Cpf= "+ Cpf);
      }
  }