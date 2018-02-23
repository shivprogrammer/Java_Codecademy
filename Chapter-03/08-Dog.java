/*
Methods: I
Let's learn about how methods in Java are used to define actions.
A method is a pre-defined set of instructions. Methods are declared within a class. Java provides some pre-defined methods available to all classes, but we can create our own as well.
Let's create a new method.

class Car {
  int modelYear;

  public Car(int year) {
    modelYear = year;
  }

  // Our new method to help us get "started"
  public void startEngine() {
    System.out.println("Vroom!");
  }

  public static void main(String[] args) {
    Car myFastCar = new Car(2007);
  }
}

In the example above, we added a method called startEngine. When the method is used, it will print out Vroom!.
Note that the startEngine method is created outside of the main method, like the construcor was.
*/

class Dog {

  int age;

  public Dog(int dogsAge) {
    age = dogsAge;
  }

  public void bark() {
    System.out.println("Woof!");
  }

  public static void main(String[] args) {

  }
}
