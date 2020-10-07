import java.util.Scanner;
/**
 *shows the factorial of a number
 * @jacoe0850 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //make scanner for input
    Scanner input = new Scanner(System.in);
    // ask for ineger and make its variable
    System.out.println("Please enter an integer to calculate the factorial of");
    int num = input.nextInt();
    // answer variable
    int factorial = 1;
    // for loop for calculation
    for(int count=1; count<=num; count++){
      factorial = count*factorial;
  }
  // declare answer
  System.out.println(num + "! =" + " " + factorial);
  }
}
