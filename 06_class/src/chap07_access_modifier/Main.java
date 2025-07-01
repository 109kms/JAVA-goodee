package chap07_access_modifier;

public class Main {

  public static void main(String[] args) {

    Car car1 = new Car();
    car1.printInfo();
    
//    Car car2 = new Car("X6", 12000);
//    car2.printInfo();
    
    Car car3 = new Car("morning", 4000, new Brand("KIA", "한국"));
    car3.printInfo();

  }

}
