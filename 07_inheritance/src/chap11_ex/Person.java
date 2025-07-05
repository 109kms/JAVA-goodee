package chap11_ex;

/**
 * 학생(Student)과 교수(Professor)를 관리하기 위한 슈퍼클래스입니다.
 * 
 * 이름을 저장할 String name 필드를 선언합니다.
 * 나이를 저장할 int age 필드를 선언합니다.
 * 전화를 저장할 String tel 필드를 선언합니다.
 * 
 * 기본 생성자와 필드를 이용한 생성자를 정의합니다.
 * 
 * Getter/Setter를 정의합니다.
 * 
 * toString() 메소드를 오버라이드합니다.
 */

public class Person {
  
  private String name;
  private int age;
  private String tel;
  
  public Person() {
    
  }

  public Person(String name, int age, String tel) {
    super();
    this.name = name;
    this.age = age;
    this.tel = tel;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  @Override
  public String toString() {
    return "Person [name=" + name + ", age=" + age + ", tel=" + tel + ", toString()=" + super.toString() + "]";
  }
  
  

}
