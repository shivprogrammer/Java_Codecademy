/*
Boolean opeartors follow rules that specify the order in which they are evaluated. This order is called Boolean operator precedence.
The precedence of each Boolean operator is as follows:
1. ! is evaluated first
2. && is evaluated second
3. || is evaluated third
*/

public class Precedence {
  public static void main(String[] args) {
    boolean riddle = !( 1 < 8 && (5 > 2 || 3 < 5));
    System.out.println(riddle);

  }
}
