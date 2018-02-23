/*
Inheritance

One of the object-oriented programming concepts that allows us to reuse and maintain code more efficiently is called inheritance. It is used to share or inherit behavior from another class. Let's look at an example:

class Car extends Vehicle {
  int modelYear;

  public Car(int year) {
    modelYear = year;
  }

  public static void main(String[] args) {
    Car myFastCar = new Car(2007);
    myFastCar.checkBatteryStatus();
  }
}

class Vehicle {
  public void checkBatteryStatus() {
  System.out.println("The batter is fully charged and ready to go!");
  }
}

In the example above the extends keyword is used to indicate that the Car class inherits the behavior defined in the Vehicle class. This makes sense, since a car is a type of vehicle.

Within the main method of Car, we call the checkBatteryStatus method on myFastCar. Since Car inherits from Vehicle, we can use methods defined in Vehicle on Car objects.
*/
