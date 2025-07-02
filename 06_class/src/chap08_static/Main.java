package chap08_static;

/*
 * 자바 프로그램의 실행 순서
 * 
 * 1. 클래스 로딩(Loading)
 *    소스코드 컴파일 시 .class 파일(바이트코드)이 생성됩니다.
 *    클래스 로더(Class Loader)가 필요한 클래스를 JVM의 Method 영역에 동적으로 로드합니다.
 * 2. 링킹(Linking)
 *    로드된 클래스에 대해 검증, 준비, 해결 단계를 통해 점검합니다.
 * 3. 초기화(Initialization)
 *    static 변수에 명시된 값으로 초기화하고, static 블록을 실행합니다.
 * 4. main() 메소드 실행
 *    main 메소드와 그 안에서 호출되는 다른 모든 메소드는 JVM의 Stack 영역에 각각의 스택 프레임을 생성합니다.
 * 5. 인스턴스 생성
 *    new 명령으로 인스턴스를 생성하면 해당 인스턴스를 Heap 영역에 할당합니다.
 * 6. 메소드 호출
 *    메소드 호출 정보가 스택 프레임에 쌓이고, 메소드 실행이 끝나면 해당 프레임이 제거됩니다.
 * 7. 프로그램 종료
 *    main 메소드가 종료 JVM이 사용하던 메모리를 해제합니다.
 *    Heap에 남아 있는 영역은 Garbage Collector에 의해서 정리됩니다.        
 */

public class Main {

  public static void main(String[] args) {

    Counter counter1 = new Counter();
    Counter counter2 = new Counter();
    Counter counter3 = new Counter();
    
    // static 멤버는 클래스를 이용해서 접근합니다.
    System.out.println("생성된 Counter 객체 수: " + Counter.count);
    Counter.viewCount();
    
    // 인스턴스 메소드는 인스턴스를 이용해서 호출합니다.
    counter1.printInfo();
    counter2.printInfo();
    counter3.printInfo();
  }

}
