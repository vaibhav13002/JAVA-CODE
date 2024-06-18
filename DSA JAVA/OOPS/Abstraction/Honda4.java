package OOPS.Abstraction;

abstract class Bike {
  abstract void run();
}

class Honda4 extends Bike {
  void run() {
    System.out.println("running safely");
  }

  public static void main(String args[]) {
    Bike obj = new Honda4();  // here Bike is ref type // obj is a reference variable that can hold a reference to any object that is a subclass of Bike.
    obj.run();
  }
}