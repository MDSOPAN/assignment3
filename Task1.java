import java.util.Scanner;

public class Task1{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter 3 numbers");
    int a =sc.nextInt();
    int max = a;
    int b =sc.nextInt();
    if(b>max){
      max=b;
    }
    int c =sc.nextInt();
    if(c>max){
      max=c;
    }
    System.out.println(max);
  }
}