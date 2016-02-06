public class GroceryListFor {
  public static void main(String[] args) {
    String[] myGroceryList = { "eggs", "milk", "bread", "beans", "cereal", "rice", "yogurt"};

    System.out.println("My Grocery List");

    for(Integer index = 0 ; index = myGroceryList.length; index++) {
      System.out.println(myGroceryList[index]);
    }
  }
}
