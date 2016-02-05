import java.io.Console;

public class MealTime {
  public static void main(String[] args) {
    askWhatYouAteForDinner("breakfast");
    askWhatYouAteForDinner("lunch");
    askWhatYouAteForDinner("dinner");
  }

  public static void askWhatYouAteForDinner(String meal) {
    Console myConsole = System.console();
    System.out.println("What did you eat for " + meal + "?");
    String yourBreakfast = myConsole.readLine();
    System.out.println("You had " + yourBreakfast + " for " + meal + ".");
  }
}
