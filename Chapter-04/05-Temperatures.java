/*
ArrayList: Access
We can access the elements of weeklyTemperatures by using an element's index, or position, in the list.
An element's index refers to its location within an ArrayList. ArrayLists in Java are zero-indexed, which means that the first element in an ArrayList is at a position of 0.

Here is an example of accessing the element in the first position of the list:

ArrayList<Integer>
quizGrades = new ArrayList<Integer>();
quizGrades.add(95);
System.out.println(quizGrades.get(0));

The example above will print out the grade value of 95.
The value of the element containing the value 95 is at position 0 in the ArrayList. We access the value by providing its index to the get method.
*/

import java.util.ArrayList;

public class Temperatures {
  public static void main(String[] args) {
    ArrayList<Integer>
    weeklyTemperatures = new ArrayList<Integer>();
    weeklyTemperatures.add(78);
    weeklyTemperatures.add(67);
    weeklyTemperatures.add(89);
    weeklyTemperatures.add(94);
    System.out.println(weeklyTemperatures.get(1));
  }
}
