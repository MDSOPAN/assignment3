import java.util.Scanner;

public class Task12{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the amount the customer need to pay(Taka)");
    double a =sc.nextDouble();
    System.out.println("Enter the amount, customer gave(Taka)");
    double b =sc.nextDouble();
    if(a >b){
      System.out.printf("Please pay %f taka more\n",a-b);
    }else if(a-b ==0){
      System.out.println("The returned amount is 0 taka.");
    }else{
      double ret = b-a;
      double rett = b-a;
      int note_100 = 0;
      int note_50 = 0;
      int note_20 = 0;
      int note_10 = 0;
      int coin_5 = 0;
      int coin_2 = 0;
      int coin_1 = 0;
      if(ret >= 100){
        note_100 = (int)ret/100;
        ret = ret%100;
      }
      if(ret >= 50){
        note_50 = (int)ret/50;
        ret = ret%50;
      }
      if(ret >= 20){
        note_20 = (int)ret/20;
        ret = ret%20;
      }
      if(ret >= 10){
        note_10 = (int)ret/10;
        ret = ret%10;
      }
      
      if(ret >= 5){
        coin_5 = (int)ret/5;
        ret = ret%5;
      }
      if(ret >= 2){
        coin_2 = (int)ret/2;
        ret = ret%2;
      }
      if(ret >= 1){
        coin_1 = (int)ret/1;
        ret = ret%1;
      }
      
      System.out.println("The returned amount is "+ rett +" taka.");
      System.out.println("100 taka note: "+ note_100);
      System.out.println("50 taka note: "+ note_50);
      System.out.println("20 taka note: "+ note_20);
      System.out.println("10 taka note: "+ note_10);
      System.out.println("5 taka coin: "+ coin_5);
      System.out.println("2 taka coin: "+ coin_2);
      System.out.println("1 taka coin: "+ coin_1);
    }
    
    
  }
}