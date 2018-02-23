/*
Objects
To use the Dog class, we must create an instance of the Dog class. An instance of a class is known as an object in Java.
The example below demonstrates how to create a Car object.

class Car {
  int modelYear;
  public Car(int year) {
    modelYear = year;
  }

  public static void main(String[] args) {
    Car myFastCar = new Car(2007);
  }
}

In the example above, we create a Car object named myFastCar. When creating myFastCar, we used the class constructor and specified a value for the requried int parameter year.

2007 is the model year of myFastCar. Note that we declared the new object inside the main method.
*/

class Car {

  int age;

  public Car(int dogsAge) {
    age = dogsAge;
  }

  public static void main(String[] args) {
    Dog spike = new Dog(4);
  }

}
