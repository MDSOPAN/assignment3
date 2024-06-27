import java.util.Scanner;

public class Task6{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number");
    int a =sc.nextInt();
    if(a < 0){
      System.out.println("Number is negative");
    }else if(a>0){
      if(a%2 == 0){
        System.out.println("Number is positive and even");
      }else{
        System.out.println("Number is positive and odd");
      }
      
    }else{
        System.out.println("Number is Zero");
    }
    
    
  }
}