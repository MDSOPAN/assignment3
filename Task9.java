import java.util.Scanner;

public class Task9{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter payment");
    int pay =sc.nextInt();
    System.out.println("Enter age");
    int age =sc.nextInt();
    int tax = 0;
    if(age<18 || pay < 10000){
      System.out.println("Your tax amounts in 0 Tk");
    }else if(pay >= 10000 && pay <=20000){
      System.out.println("Your tax amounts in "+(pay*0.05)+" Tk");
    }else{
      System.out.println("Your tax amounts in "+(pay*0.1)+" Tk");
    }
  }
}