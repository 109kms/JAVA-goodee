package chap03_ex;

public class Ex07 {

  public static void main(String[] args) {
    
    // 정수형 변수 n을 이용하여 n!(팩토리얼) 값을 구하세요.
    // n은 1 ~ 20 사이의 값을 가져야 합니다.

    int total = 1;
    
    System.out.print("5! " + "= ");
    
    for(int n = 5; n > 0; n--) {
      System.out.print(n);
      total *= n;
      if(n > 1) {
        System.out.print(" * ");
      }
      
    }
    System.out.println(" = " + total);
  }

}
