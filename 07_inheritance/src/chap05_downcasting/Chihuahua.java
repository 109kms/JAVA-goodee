package chap05_downcasting;


public class Chihuahua extends Dog{

  @Override
  public void bark() {
    System.out.println("치치치!");
  }
  
  public void getAngry() {
    System.out.println("치와와는 화를 낼 수 있다");
  }
  
}
