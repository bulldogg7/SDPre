import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {
        
    System.out.println("How old are you?");
    
    Scanner input = new Scanner(System.in);
    int age = input.nextInt();

    int currentYear = Year.now();
    int birthYear = currentYear - age;
    
    System.out.println("You were born in " + birthYear);
    input.close();
  }
}