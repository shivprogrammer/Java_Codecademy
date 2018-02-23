/*
HashMap: Manipulation

HashMap<String, Integer>
myFriends = new HashMap<String, Integer>();

myFriends.put("Mark", 24);
myFriends.put("Cassandra", 25);
myFriends.put("Zenas", 21);

In the example above, we used the put method to add a String key and an associated Integer value. The String key is the text inside double quotes " ". The Integer value is represented by the number.
*/

import java.util.HashMap;

public class Restaurant {
  public static void main(String[] args) {
    HashMap<String, Integer>
    restaurantMenu = new HashMap<String, Integer>();
    restaurantMenu.put("Turkey Burger", 13);
    restaurantMenu.put("Naan Pizza", 11);
    restaurantMenu.put("Cranberry Kale Salad", 10);
  }
}
