public class GeneralizationsB {
  public static void main(String[] args) {
    // (3 >= 3 && !(true || true));
    boolean tricky = false; // result of previous comment

    if (2015 > 2016) {
      System.out.println("Stuck in the past...");
    }
    else {
      System.out.println("Upgraded to the future!");
    }

    int subwayTrain = 5;

    switch (subwayTrain) {
      case 1:
        System.out.println("This is a South Ferry bound train!");
        break;
      case 5:
        System.out.println("This is a Brooklyn bound train!");
        break;
      case 7:
        System.out.println("This is a queens bound train");
        break;
      default:
        System.out.println("I'm not sure where that train goes...");
    }
  }
}
