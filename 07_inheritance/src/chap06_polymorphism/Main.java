package chap06_polymorphism;

public class Main {

  public static void main(String[] args) {

    Chihuahua chihuahua = new Chihuahua("adsf");
    Husky husky = new Husky("qwer");
    Person person = new Person();
    
    person.feedFood("개껌", chihuahua);
    person.feedFood("개껌", husky);
    
  }

}
