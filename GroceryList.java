public class GroceryList {
  public static void main(String[] args) {
    String[]myGroceryList = { "eggs", "milk", "bread", "bananas", "cereal", "rice"};

    Integer[] groceryItemPrices = { 3, 6, 4, 2, 4, 4 };

    System.out.println("My Grocery List");

      for ( String groceryItem : myGroceryList) {
        System.out.println( groceryItem );

    }
    Integer total = 0;

    for(Integer price : groceryItemPrices) {
      total += price;
    }

    System.out.println("Your total for this trip will be $" + total);
  }

}
