package chap12_Book_Publisher;

// 문제. Book 객체를 만들고 Setter를 호출하여 적절한 정보를 저장하세요.
//       정보 저장 뒤 Getter를 호출하여 해당 정보를 확인하세요.

public class Main {

  public static void main(String[] args) {
    
    Book book = new Book();
    book.setTitle("혼자 공부하는 자바");
    
    Publisher publisher = new Publisher();
    publisher.setName("한빛미디어");
    publisher.setLocation("qqq");
    
    Contact contact = new Contact();
    contact.setTel("010-1234-5678");
    contact.setFax("010-1111-2222");
    publisher.setContact(contact);
    book.setPublisher(publisher);
    
    System.out.println("책이름: " + book.getTitle());
    System.out.println("출판사: " + book.getPublisher().getName());
    System.out.println("출판사위치: " + book.getPublisher().getLocation());
    System.out.println("출판사번호: " + book.getPublisher().getContact().getTel());
    System.out.println("출판사팩스: " + book.getPublisher().getContact().getFax());
    
  }

}
