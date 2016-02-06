import java.io.Console;

public class Friends {
  public static void main(String[] args) {
    Console myConsole = System.console();

    String[] myFriends = { "He", "She", "Sally", "Jim", "Susan"};


      for(String name : myFriends) {
        System.out.println(name += " is my friend.");
      }
  }
}
