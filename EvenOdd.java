import java.io.Console;

public class EvenOdd {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Give me a number.");
    String myStringNumber = myConsole.readLine();
    Integer myNumber = Integer.parseInt(myStringNumber);

    for(Integer number = 0; number < myNumber.length; number++) {
      if (number % 2 == 0) {
        System.out.println("This number is even!");
      } else {
        System.out.println("This number is odd!");
      }
    }
  }
}
INCOMPLETE
