import java.io.Console;

public class addTogether {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Give me a number!");
    String stringNumber1 = myConsole.readLine();

    System.out.println("Give me another number!");
    String stringNumber2 = myConsole.readLine();

    Integer yourNumber1 = Integer.parseInt(stringNumber1) + Integer.parseInt(stringNumber2);

    System.out.println("Here it is: " + yourNumber1);
  }
}
