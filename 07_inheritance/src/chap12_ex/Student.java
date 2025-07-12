package chap12_ex;

/**
 * 학생(Student)은 사람(Person)입니다.
 * 
 * 학번을 저장할 String studentId 필드를 선언합니다.
 * 
 * 기본 생성자와 필드를 이용한 생성자를 정의합니다.
 * 
 * Getter/Setter를 정의합니다.
 * 
 * toString() 메소드를 오버라이드합니다.
 */

public class Student extends Person{
  
  private String studentId;
  
  public Student() {
    
  }

  public Student(String sudentId) {
    super();
    this.studentId = sudentId;
  }

  public String getStudentId() {
    return studentId;
  }

  public void setStudentId(String sudentId) {
    this.studentId = sudentId;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return "Student [이름=" + getName() + ", 나이=" + getAge() + ", 전화번호=" + getTel() + ", 학번=" + studentId + "]";
  }
  
  

}
