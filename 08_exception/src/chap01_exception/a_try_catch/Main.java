package chap01_exception.a_try_catch;

import javax.swing.JOptionPane;

/*
 * 예외 처리 (Exception Handling)
 * 
 * 1. 프로그램의 실행 중 발생할 수 있는 비정상적인 상황(예외 상황)에 대해 적절히 대응하는 것을 의미합니다.
 * 2. 발생한 예외로 인해서 그로그램이 비정상적으로 종료되는 것을 막을 수 있습니다.
 * 3. 발생한 예외를 분석하여 예외의 원인을 파악하고 복구를 시도할 수 있습니다.
 * 4. 기본 구문
 *    1) try 블록   : 예외 발생 가능성이 있는 코드를 작성하는 블록
 *    2) catch 블록 : 예외가 발생했을 때 실행할 코드를 작성하는 블록
 */

public class Main {
  
  public static void tryCatch() {
    
    // 예외 발생 가능성이 있는 코드
    try {
      String input = JOptionPane.showInputDialog("정수를 입력하세요.");
      int number = Integer.parseInt(input);
      System.out.println(number);
    }
    
    // 예외 발생 시 동작하는 코드
    catch(NumberFormatException e) {
      System.out.println("정수만 입력하세요.");
    }
  }

  public static void main(String[] args) {

    tryCatch();

  }

}
