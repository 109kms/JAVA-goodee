package chap03_ex;

public class Ex08 {

  public static void main(String[] args) {

    // 전체 구구단을 세로 방향으로 출력하세요.

    // 출력 예시
    // 2x1=2
    // 2x2=4
    // ...
    // 9x9=81
    
    for(int a = 2; a <= 9; a++) {
      for(int b = 1; b <= 9; b++) {
        System.out.println(a + "x" + b + "=" + (a * b));
        
      }
    }
  }

}
