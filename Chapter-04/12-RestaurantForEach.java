/*
Iterating over a HashMap

We can also access properties of a HashMap, such as the number of entries or the contents of the HashMap.

Let's access the length and print out the contents of the myFriends:

HashMap<String, Integer>
myFriends = new HashMap<String, Integer>();

myFriends.put("Mark", 24);
myFriends.put("Cassandra", 25);
myFriends.put("Zenas", 21);

System.out.println(myFriends.size());

for (String name : myFriends.keySet()) {
  System.out.println(name + " is age: " + myFriends.get(name));
}

In the example above, the size method of HashMap prints out the size of the myFriends instance. As a result, the console prints out 3 since there are 3 key-value pairs.

Next, we use a for each loop to iterate over each key in myFriends. The keySet method of HashMap returns a list of keys.

Inside the loop, we access the current key name and use the get method of HashMap to access the value. The console will print out the names and ages of each of my friends.
*/

import java.util.HashMap;

public class Restaurant {
  public static void main(String[] args) {
    HashMap<String, Integer>
    restaurantMenu = new HashMap<String, Integer>();
    restaurantMenu.put("Turkey Burger", 13);
    restaurantMenu.put("Naan Pizza", 11);
    restaurantMenu.put("Cranberry Kale Salad", 10);

    System.out.println(restaurantMenu.size());

    for (String item : restaurantMenu.keySet()) {
      System.out.println("A " + item + " costs " + restaurantMenu.get(item) + " dollars.");
    }
  }
}
