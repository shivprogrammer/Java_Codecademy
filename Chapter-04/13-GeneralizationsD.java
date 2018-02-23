/*
- For Loops: used to repeatedly run a block of code
- For Each Loops: a concise version of a for loop
- ArrayList: stores a list of data
- HashMap: stores keys and associated values like a dictionary
*/

import java.util.ArrayList;
import java.util.HashMap;

public class GeneralizationsD {
  public static void main(String[] args) {
    ArrayList<String>
    sports = new ArrayList<String>();
    sports.add("Football");
    sports.add("Boxing");

    for (String sport : sports) {
      System.out.println(sport);
    }

    // major cities and their founding year
    HashMap<String, Integer>
    majorCities = new HashMap<String, Integer>();
    majorCities.put("New York", 1624);
    majorCities.put("London", 43);
    majorCities.put("Mexico City", 1521);
    majorCities.put("Sao Paulo", 1554);
  }
}
