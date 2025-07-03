package chap11_Member_Address;

// 문제. 생성자를 호출하여 Member 객체를 만들고 printInfo() 메소드를 호출하여 객체의 정보를 확인하세요.

public class Main {

  public static void main(String[] args) {
    
    Address home = new Address("12345", "가산로123", "km타워 2층");
    Address delivery = new Address("12345", "가asdf3", "kasdf층");
    
    Member member = new Member(home, delivery);
    
    member.printInfo();
    
  }

}
