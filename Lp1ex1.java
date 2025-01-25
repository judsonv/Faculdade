/* 5.Faça um programa em java que
leia dois números  e mostre o maior.*/
 
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
    System.out.println("Digite um número: ");
    int a=ler.nextInt();
    System.out.println("Digite outro número: ");
    int b=ler.nextInt();
    if (a==b){
    System.out.println ("Os números são IGUAIS:");
  }else
    if (a>b){
     System.out.println ("O número maior é: " + a);
  }
  else{
    System.out.println ("O número maior é: " + b);
  }

  
  }
}