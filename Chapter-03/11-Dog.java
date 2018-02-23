/*
Using Methods: II
The void keyword indicates that no value should returned by the method after it executes all the logic in the method. If we do want the method to return a value after it finishes running, we can specify the return type.
1. The void keyword(which means "completely empty") indicates to the method that no value is returned after calling that method.
2. Alternatively, we can use data type keyword(such as int, char, etc.) to specify that a method should return a value of that type.

An example of of indicating a return value for a method is below:

class Car {
  int modelYear;

  public Car(int year) {
    modelYear = year;
  }

  public void startEngine() {
    System.out.println("Vroom!");
  }

  public void drive(int miles) {
    System.out.println("You have driven: " + miles + " miles!");
  }

  public int numberOfTires() {
    return 4;
  }
  public static void main(String[] args) {
    Car myFastCar = new Car(2007);
    myFastCar.startEngine();
    myFastCar.drive(1684);
    int tires = myFastCar.numberOfTires();
    System.out.println(tires);
  }
}
*/
