import java.util.ArrayList;
import java.util.*;

public class NLPRunner {
  public static void main(String[] args) {

Scanner input = new Scanner(System.in);
    
    System.out.println("Note: Can only find ages older than 10 and younger than 100");
    System.out.println("\n" + "Please type the sentence you want analyzed:");

    String test = input.nextLine();  
    
    System.out.println("\n" + new nameFind(test));
  }
}