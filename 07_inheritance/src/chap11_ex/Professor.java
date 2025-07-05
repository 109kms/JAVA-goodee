package chap11_ex;

/**
 * 교수(Professor)는 사람(Person)입니다.
 * 
 * 전공을 저장할 String major 필드를 선언합니다.
 * 
 * 기본 생성자와 필드를 이용한 생성자를 정의합니다.
 * 
 * Getter/Setter를 정의합니다.
 * 
 * toString() 메소드를 오버라이드합니다.
 */

public class Professor extends Person{
  
  private String major;
  
  public Professor() {
    
  }

  public Professor(String major) {
    super();
    this.major = major;
  }

  public String getMajor() {
    return major;
  }

  public void setMajor(String major) {
    this.major = major;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return "Professor [이름=" + getName() + ", 나이=" + getAge() + ", 전화번호=" + getTel() + ", 전공=" + major + "]";
  }
  
  

}
