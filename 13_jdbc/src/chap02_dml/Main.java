package chap02_dml;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

/*
 * java.sql.PreparedStatement
 * 
 * 1. 자바에서 데이터베이스 쿼리문을 실행하기 위해 사용하는 인터페이스입니다.
 * 2. PreparedStatement 객체를 생성하기 전에 미리 쿼리문이 완정되어 있어야 합니다.
 * 3. 주요 특징
 *    1) 파라미터 바인딩 : 쿼리문에서 값이 들어갈 자리에 "?"(Placeholder)를 사용하고, 실행 전에 값을 바인딩합니다.
 *    2) SQL Injection 방지 : 파라미터 바인딩을 통해 입력되는 값이 자동으로 이스케이프 처리되기 때문에 SQL Injection을 예방합니다.
 */

public class Main {
  
  public static void insert() throws Exception {
    
    //----- DB 접속
    Connection con = DBConnection.getConnection();
    
    //----- 쿼리문
    String sql = "INSERT INTO tbl_board(uid, title, content) VALUES(?, ?, ?)";
    
    //----- PreparedStatement 객체 생성
    PreparedStatement ps = con.prepareStatement(sql);
    
    //----- tbl_board 테이블에 저장할 값 입력 받기
    Scanner sc = new Scanner(System.in);
    System.out.print("사용자 아이디(1,2,3) 입력 >>> "); int uid = sc.nextInt();
    System.out.print("게시글 제목 입력 >>> "); String title = sc.next(); sc.nextLine();
    System.out.print("게시글 내용 입력 >>> "); String content = sc.nextLine();
    
    //----- 입력 받는 값으로 파라미터 바인딩
    ps.setInt(1, uid);  // 1번째 ?에 uid 바인딩
    ps.setString(2, title);  // 2번째 ?에 title 바인딩
    ps.setString(3, content);  // 3번째 ?에 content 바인딩
    
    //----- 쿼리문 실행 (DML은 executeUpdate() 메소드를 호출합니다.)
    int count = ps.executeUpdate();  //----- 성공한 행(Row)의 개수를 반환합니다.
    
    //----- 결과 확인
    System.out.println(count + " 행이 삽입되었습니다.");
    
    //----- 자원 해제
    ps.close();
    con.close();
    sc.close();
    
  }
  
  public static void update() throws Exception {
    
  }
  
  public static void delete() throws Exception {
    
  }

  public static void main(String[] args) {
    try {
      insert();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}
