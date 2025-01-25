class Main {
    public static void main(String[] args) {
       Pessoafisica pf1=new Pessoafisica("Judson", "Vieira", "125963741-82", "Joao Silva e Carla Souza","10/15/2000");
       pf1.informacoes();
       Pessoafisica pf2=new Pessoafisica("Joao", "Silva", "475963741-82", "Joaquim Souza e Claudia Rabelo", "16/10/1999");
       pf2.informacoes();
   
       Pessoajuridica pj1=new Pessoajuridica("Comercial Andrade", "Drogaria Andrade", "DGRA", "123654789/0001", "Carlos da Cunha e Alexia Teixeira", "25/07/1997");
       pj1.informacoes();
       Pessoajuridica pj2=new Pessoajuridica("Comercial Ruas", "Lanchonete Quero Mais", "LCQM", "123654149/0001","Junior Alfredo e Mônica Teixeira","17/02/1996");
       pj2.informacoes();
       
     
     
     }
   }
