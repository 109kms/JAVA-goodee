package chap03_ex;

public class Ex02 {

  public static void main(String[] args) {
    
    // 정수형 변수 3개에 임의의 값을 저장한 뒤, 그 중에서 가장 큰 수를 출력하세요.
    int a = 15;
    int b = 1;
    int c = 9;
    int max;
    
    if (a > b && a > c) {
      max = a;
    } else if (b > a && b > c) {
      max = b;
    } else {
      max = c;
    }
    System.out.println(max);
    

  }

}
