package chap01_connect;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/*
 * java.sql.Connection
 * 
 * 1. 데이터베이스와의 연결(세션)을 나타내는 인터페이스입니다.
 * 2. SQL 쿼리 실행, 트랜잭션 관리, 데이터베이스 설정 등 다양한 작업을 수행할 수 있습니다.
 * 3. 주요 기능
 *    1) SQL 쿼리 실행 : Statement, PreparedStatement 객체 생성
 *    2)
 */

public class DBConnection {
  
  public static Connection getConnection() throws ClassNotFoundException, SQLException, IOException {
    
    //----- jdbc.properties 파일을 읽기 위한 입력 스트림
    File file = new File("jdbc.properties");
    FileInputStream in = new FileInputStream(file);
    
    //----- Properties 객체 생성 및 jdbc.properties 파일 등록
    Properties properties = new Properties();
    properties.load(in);
    
    //----- 드라이버 클래스 (com.mysql.cj.jdbc.Driver) 로드
    Class.forName(properties.getProperty("driver"));
    
    //----- DB 접속
    Connection con = DriverManager.getConnection(
        properties.getProperty("url"),
        properties.getProperty("user"),
        properties.getProperty("password"));
    
    //----- DB 접속 링크 반환
    return con;
    
    
  }

}
