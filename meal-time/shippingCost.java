import java.io.Console;

public class shippingCost {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("What is the weight of your package?");
    String stringWeight = myConsole.readLine();

    System.out.println("How far is your package travelling?");
    String stringDistance = myConsole.readLine();

    double finalPrice = (Double.parseDouble(stringWeight) + Double.parseDouble(stringDistance)) / 8;

    //Integer

    System.out.println("Your final shipping cost is: " + finalPrice + ".");
  }
}

KEEP WORKING ON THIS ONE!



//     shippingCost("weight");
//     shippingCost("distance to travel");
//     shippingCost("discount");
//   }
//
//   public static void shippingCost(String cost) {
//     Console myConsole = System.console();
//     System.out.println("what is the " + cost + "?");
//     String yourPackage = myConsole.readLine();
//     System.out.println("Your " + cost + " is " + yourPackage + ".");
//
//     Integer finalCost = Integer.parseInt(yourPackage) + Integer.parseInt(yourPackage) + Integer.parseInt(yourPackage);
//
//     System.out.println("Your shipping cost is: " + finalCost + ".");
//   }
//
// }
