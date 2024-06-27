import java.util.Scanner;

public class Task10{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter 3 numbers");
    float a =sc.nextFloat();
    float max = a;
    float min = a;
    float b =sc.nextFloat();
    if(b>max){
      max=b;
    }
    if(b<min){
      min=b;
    }
    float c =sc.nextFloat();
    if(c>max){
      max=c;
    }
    if(c<min){
      min=c;
    }
    System.out.println("Maximum number is " + max);
    System.out.println("Minimum number is " + min);
  }
}