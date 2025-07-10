package chap04_random;

public class Main {
  
  public static void mathRandom() {
    
    /*
     * java.lang.Math
     * 
     * 1. 수학 관련 메소드를 가지고 있는 클래스입니다.
     * 2. 정적 메소드로 구성되어 있어서 객체를 생성할 필요가 없습니다.
     */
    
    System.out.println(Math.random());  //--------------- 0.0 <= 난수 < 1.0
    System.out.println(Math.random() * 3);  //----------- 0.0 <= 난수 < 3.0
    System.out.println((int)(Math.random() * 3)); //------- 0 <= 난수 < 3
    System.out.println((int)(Math.random() * 3 + 1));  //-- 1 <= 난수 < 4
    
    // 주사위 던지기
    int dice = (int)(Math.random() * 6 + 1);
    System.out.println(dice);
    
  }

  public static void secureRandom() {
    
    /*
     * java.security.SecureRandom
     * 
     * 1. 암호학적으로 강력한 난수 생성기를 제공하는 클래스입니다.
     * 2. 시드(seed) 기반 난수 생성기이지만, 동일한 시드라도 동일한 결과를 보장하지 않습니다.
     * 3. 암호화 키, 토큰, 세션ID 등 보안이 필요한 값에는 SecureRandom 사용이 권장됩니다.
     */
    
  }
  
  public static void main(String[] args) {
    mathRandom();

  }

}
