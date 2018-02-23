/*
Java provides a shortcut that allows you to write if/else statements in a single line of code. It is called the ternary conditional statement.
The term ternary comes from a Latin word that means "composed of three parts".
These three parts are:
1. A Boolean expression
2. A single statement that gets executed if the Boolean expression is true
3. A single statement that gets executed if the Boolean expression is false
*/

public class Ternary {
  public static void main(String[] args) {
    int fuelLevel = 3;
    char canDrive = (fuelLevel > 0) > 'Y' : 'N';
    System.out.println(canDrive);
  }
}
