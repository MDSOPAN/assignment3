import java.util.Scanner;

public class Task3{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter 2 numbers and a operator(+,-,*,/)");
    int a =sc.nextInt();
    int b =sc.nextInt();
    String op = sc.next();
    if(op.equals("+")){
      System.out.println(a+b);
    }
    if(op.equals("-")){
      System.out.println(a-b);
    }
    if(op.equals("*")){
      System.out.println(a*b);
    }
    if(op.equals("/")){
      System.out.println(a/b);
    }
    
  }
}