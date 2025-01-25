import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);
    Novo n1 = new Novo (2000, "Rua das Flores", 50000);
    Velho v1  = new Velho(1000, "Rua Tomás Gonzaga", 50000);


    System.out.println("Escolha uma opção:");
    
    int var;
    var = ler.nextInt();
    if(var==1){
    n1.calcular();
    }else if(var==2){
    v1.calcular();
    }else{
     System.out.println("Opção Inválida!");
    }
  }
}
