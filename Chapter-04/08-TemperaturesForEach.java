/*
For Each Loop
Here is an example of the concise for each loop:

for (Integer grade : quizGrades) {
  System.out.println(grade);
}

In the example above, the colon (:) can be read as "in". The for each loop altogether can be read as "for each Integer element (called grade) in quizGrades, print out the value of grade."

The loop will print out the value of each Integer element in quizGrades.

*Note: the for each loop does not require a counter.
*/

import java.util.ArrayList;

public class TemperaturesForEach {
  public static void main(String[] args) {
    ArrayList<Integer>
    weeklyTemperatures = new ArrayList<Integer>();
    weeklyTemperatures.add(78);
    weeklyTemperatures.add(67);
    weeklyTemperatures.add(89);
    weeklyTemperatures.add(94);

    for (Integer temperature : weeklyTemperatures) {
      System.out.println(temperature);
    }
  }
}
