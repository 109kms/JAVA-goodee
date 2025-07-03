package chap04_upcasting;

import chap05_downcasting.Dog;

public class Husky extends Dog{

  @Override
  public void bark() {
    System.out.println("wowwowwow");
  }
  
}
