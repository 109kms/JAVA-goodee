package chap10_instance_array;

public class Main {

  public static void main(String[] args) {

    Bus bus = new Bus();
    
    bus.on(new Person("낸시"));
    bus.on(new Person("폴"));
    bus.on(new Person("제레미"));
    bus.on(new Person("제미레"));
    bus.on(new Person("미레제"));

    bus.off(2);
    
    bus.seatInfo();
  
  
  }

}
