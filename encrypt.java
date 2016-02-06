import java.io.Console;

public class encrypt {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Give me a phrase to encrypt:");
    String myResults = myConsole.readLine();
    String myEncryptedReuslts = myResults.replaceAll("e", myResults);

    System.out.println("Your encrypted phrase is:" + myEncryptedResults + ".");

  }
}
