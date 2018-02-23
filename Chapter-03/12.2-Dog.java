class Dog extends Animal {

  int age;

  public Dog(int dogsAge) {
    age = dogsAge;
  }

  public void bark() {
    System.out.println("Woof!");
  }

  public int run(int distance) {
    System.out.println("Doggy ran this many feet: " + distance);
  }

  public void getAge() {
    return age;
  }

  public static void main(String[] args) {
    Dog spike = new Dog(4);
    spike.bark();
    spike.run(1000)
    int spikeAge = spike.getAge();
    spike.battleCry();
  }
}
