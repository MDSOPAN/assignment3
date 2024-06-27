import java.util.Scanner;

public class Task8{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter student id");
    int id =sc.nextInt();
    int f3=id/100000;
    int sem = f3%10;
    String sems ="";
    if(sem == 1){
      sems="Spring";
    }else if(sem == 2){
      sems="Fall";
    }
    else{
      sems="Summer";
    }
    int year = f3/10;
    System.out.println("Student joined BRAC in "+ sems+" "+year);
  }
}