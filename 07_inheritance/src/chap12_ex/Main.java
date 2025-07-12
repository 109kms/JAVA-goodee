package chap12_ex;

public class Main {

  public static void main(String[] args) {
    
    //----- 학생을 5명 생성합니다.
    Student s1 = new Student();
    s1.setName("홍길동");
    s1.setAge(20);
    s1.setTel("010-1111-1111");
    s1.setStudentId("111");
    Student s2 = new Student();
    s2.setName("김아무개");
    s2.setAge(21);
    s2.setTel("010-2222-2222");
    s2.setStudentId("222");
    Student s3 = new Student();
    s3.setName("가나다라");
    s3.setAge(22);
    s3.setTel("010-3333-3333");
    s3.setStudentId("333");
    Student s4 = new Student();
    s4.setName("김민석");
    s4.setAge(24);
    s4.setTel("010-4444-4444");
    s4.setStudentId("444");
    Student s5 = new Student();
    s5.setName("김치치");
    s5.setAge(25);
    s5.setTel("010-5555-5555");
    s5.setStudentId("555");
    
    
    //----- 교수를 3명 생성합니다.
    Professor p1 = new Professor();
    p1.setName("김루루");
    p1.setAge(26);
    p1.setTel("010-6666-6666");
    p1.setMajor("컴공");
    Professor p2 = new Professor();
    p2.setName("김네네");
    p2.setAge(27);
    p2.setTel("010-7777-7777");
    p2.setMajor("네트워크보안");
    Professor p3 = new Professor();
    p3.setName("김미미");
    p3.setAge(28);
    p3.setTel("010-8888-8888");
    p3.setMajor("AI소프트웨어");
    
    
    //----- 대학을 1개 생성합니다.
    College college = new College("서울대");
      
    //----- 학생 5명과 교수 3명을 대학에 등록합니다.
    college.addStudent(s1);
    college.addStudent(s2);
    college.addStudent(s3);
    college.addStudent(s4);
    college.addStudent(s5);
    college.addProfessor(p1);
    college.addProfessor(p2);
    college.addProfessor(p3);
    
    //----- 학생 1명과 교수 1명을 대학에서 삭제합니다.
    college.removeProfessor(0);
    college.removeStudent(s1);
    
    //----- 대학 정보를 출력해서 정보를 확인합니다.
    college.collegeInfo();

  }

}
