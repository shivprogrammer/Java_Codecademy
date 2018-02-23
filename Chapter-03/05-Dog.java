/*
Classes: Constructor Parameters
Let's modify this by adding parameters to the Dog constructor.
You can think of parameters like options at an ice ceam store. You can choose to order a traditional ice cream cone, but other times you may want to specify the size of the cone or the flavor of the ice cream.

For the Dog class, we can specify the initial dog age by adding parameters to the class constructor.
1. Parameters allow data types to be created with specified attributes.

class Car {
  // Use instance variables to model our Car class after a real-life car
  int modelYear;

  public Car(int year) {
    modelYear = year;
  }
}
*/

class Car {

  int age;

  public Car(int dogsAge) {
    age = dogsAge;
  }

  public static void main(String[] args) {
    
  }
}
