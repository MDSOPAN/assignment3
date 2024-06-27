import java.util.Scanner;

public class Task2{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter gained marks");
    int grades =sc.nextInt();
    
    if(grades < 50){
      System.out.println("You grade is F");
    }
    else if(grades <= 56){
      System.out.println("You grade is D");
    }
    else if(grades <= 69){
      System.out.println("You grade is C");
    }
    else if(grades <= 84){
      System.out.println("You grade is B");
    }
    else if(grades <= 89){
      System.out.println("You grade is A-");
    }
    else if(grades <= 100){
      System.out.println("You grade is A");
    }
  }
}