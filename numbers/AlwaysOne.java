import java.io.Console;

public class AlwaysOne {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Give me any number!");
    System.out.println("I will turn it to 1!");
    String stringNumber = myConsole.readLine();

    Integer yourNumber = Integer.parseInt(stringNumber);
    Integer theNumberOne = yourNumber / yourNumber;

    String stringNumberOne = Integer.toString(theNumberOne);
    System.out.println("Here it is: " + stringNumberOne);
  }
}
