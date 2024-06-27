import java.util.Scanner;

public class Task7{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number");
    int a =sc.nextInt();
   
    if(a<0){
      System.out.println(2*a);
    }
    else if(0<=a && a <2){
      System.out.println(a+1);
    }else if(2 <=a && a<5){
      System.out.println((a*a)-1);
    }else{
      System.out.println(3*(a*a)+2);
    }
  }
}