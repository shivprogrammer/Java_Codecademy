/*
Methods: II
Similar to constructors, you can customize methods to accept parameters.

class Car {

  int modelYear;

  public Car(int year) {
    modelYear = year;
  }

  public void startEngine() {
    System.out.println("Vroom!");
  }

  public void drive(int distanceInMiles) {
    System.out.println("Miles driven: " + distanceInMiles);
  }

  public static void main(String[] args) {
    Car myFastCar = new Car(2007);
    myFastCar.startEngine();
    myFastCar.drive(1628);
  }
}
*/

class Dog {
  int age;

  public Dog(int dogsAge) {
    age = dogsAge;
  }

  public void bark() {
    System.out.println("Woof!");
  }

  public void run(int feet) {
    System.out.println("Your dog ran " + feet + " feet!");
  }

  public static void main(String[] args) {
    Dog spike = new Dog(4);
    spike.bark();
    spike.run(1000);
  }
}
