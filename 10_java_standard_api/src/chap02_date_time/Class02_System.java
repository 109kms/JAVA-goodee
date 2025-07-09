package chap02_date_time;

import java.text.SimpleDateFormat;

/*
 * System.currentTimeMillis()
 * 
 * 1. 1970년 1월 1일 00:00:00 UTC (Epoch Time) 기준으로 현재 시각을 밀리초 단위로 반환합니다. (long 타입)
 * 2. 로그, 만료 시간 계산 등의 작업을 수행할 수 있습니다.
 * 3. 시스템과 OS의 영향을 받습니다.
 */

// second > ㎳ (밀리, 1/1000) > ㎲ (마이크로, 1/1_000_000) > ㎱ (나노, 1/1_000_000_000) > ㎰ (피코, 1/1_000_000_000_000)

/*
 * System.nanoTime()
 * 
 * 1. 임의의 기준 시점으로부터 경과한 나노초 단위 값을 반환합니다. (long 타입)
 * 2. 두 시점의 나노초 값을 빼서 코드 실행 시간, 함수 호출 시간 등 특정 경과 시간을 정확하게 측정하기 위해 사용합니다.
 *    (성능 테스트용)
 * 3. 실제 정밀도는 하드웨어나 OS에 의해서 달라질 수 있습니다.
 */

public class Class02_System {

  public static void main(String[] args) {

    // System.currentTimeMillis()
    long timestamp = System.currentTimeMillis();
    System.out.println(timestamp);
    
    // with SimpleDateFormat
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
    System.out.println(sdf.format(timestamp));
    
    
    // System.nanoTime()
    long start = System.nanoTime();
    System.out.print("Hello");

    long stop = System.nanoTime();
    long elapsed = stop - start;  // 나노초 단위의 경과시간
    System.out.println("경과 시간: " + (elapsed / 1_000_000.0) + "ms");
    

  }

}
