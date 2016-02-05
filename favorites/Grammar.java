import java.io.Console;

public class Grammar {
  public static void main(String[] args) {
    Console myConsoleNoun = System.console();
    System.out.println("Give me a noun.");
    String grammarNoun = myConsoleNoun.readLine();

    Console myConsoleAdj = System.console();
    System.out.println("Give me an adjective");
    String grammarAdj = myConsoleAdj.readLine();

    System.out.println("What a " + grammarAdj + " " + grammarNoun + "!");
  }
}
