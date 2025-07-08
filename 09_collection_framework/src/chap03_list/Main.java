package chap03_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Collection 인터페이스
 * 
 * 1. 자바 컬레션 프레임워크(JCF)의 핵심 인터페이스입니다.
 * 2. 데이터의 집합(여러 데이터)을 다루는 기본 동작을 제공합니다.
 * 3. Iterable 인터페이스의 하위 인터페이스로 for-each와 같은 반복문에서 활용할 수 있습니다.
 * 4. List, Set, Queue 인터페이스의 상위 인터페이스로 해당 인터페이스들릐 공통 동작(추가, 삭제 등)을 추상화합니다.
 * 5. 제네릭(Generic)을 지원하여 타입 안정성을 보장합니다.
 * 6. 주요 메소드
 *    1) int size()  저장된 요소의 개수 반환
 *    2) boolean isEmpty()  컬렉션이 비어 있으면 true 반환
 *    3) boolean contains(Object e)  전달된 객체가 컬렉션에 포함되어 있으면 true 반환
 *    4) boolean add(E e)  전달된 객체 저장
 *    5) boolean remove(Object o)  전달된 객체 삭제
 */

/*
 * List 인터페이스
 * 
 * 1. Collection 인터페이스의 하위 인터페이스입니다.
 * 2. 객체들을 저장할 때 저장된 순서를 유지합니다. (인덱스를 사용합니다.)
 * 3. 중복된 데이터의 저장이 가능합니다.
 * 4. 주요 구현클래스
 *    1) ArrayList : 배열처럼 연속된 공간을 사용하는 리스트 (순회 강점 / 삭제 단점)
 *    2) LinkedList : 서로 다른 공간을 참조로 연결해서 사용하는 리스트
 *    3) Vector : 컬렉션 프레임워크 이전의 클래스. 기존 메소드와 컬렉션 프레임워크 메소드가 섞여 있습니다.
 */

public class Main {
  
  public static void mutable() {
    
    //----- mutable : 저장된 요소의 개수를 변경할 수 있는 리스트 (크기는 자동 변경)
    
    List<String> seasons = new ArrayList<String>();  // 디폴트 크기: 10
    
    seasons.add("spring");  // 순서대로 저장
    seasons.add("summer");
    seasons.add("autumn");
    seasons.add("winter");
    
    System.out.println(seasons.size());  // 크기 확인
    
    System.out.println(seasons.get(0));  // 요소 확인
    System.out.println(seasons.get(1));
    System.out.println(seasons.get(2));
    System.out.println(seasons.get(3));
    
  }
  
  public static void immutable() {
    
  //----- mutable : 저장된 요소의 개수를 변경할 수 없는 리스트
    
    List<String> seasons = Arrays.asList("spring", "summer", "autumn", "winter");
    
//    seasons.add("aespa");  // 요소 추가 (실패)
//    seasons.remove(0);     // 인덱스 0 요소 삭제 (실패)
    
    seasons.set(0, "봄");  // 인덱스 0 요소 수정 (성공)
    seasons.set(1, "여름");
    seasons.set(2, "가을");
    seasons.set(3, "겨울");
    
    System.out.println(seasons);
    
  }
  
  public static void traversal() {
    
    List<String> seasons = Arrays.asList("spring", "summer", "autumn", "winter");
    
    // 일반 for문: size() 메소드 호출의 반복을 제거하기 위해서 초기화 영역에서 한 번만 호출합니다.
    for (int i = 0, length = seasons.size(); i < length; i++) {
      System.out.println(seasons.get(i));
    }
    
    // 향상 for문
    for (String season : seasons) {
      System.out.println(season);
    }
    
  }

  public static void sort() {
    
    /*
     * List 정렬하기
     * 
     * 1. 오름차순 정렬
     *    Collections(List<Comparable>)
     * 2. 내림차순 정렬
     *    Collections(List<Comparable>, Collections.reverseOrder())
     * 3. List 정렬을 위해서는 Comparable 인터페이스를 구현한 객체를 요소로 저장해야 합니다.
     */
    
    /*
     * Comparable 인터페이스
     * 
     * 1. Functional Interface입니다. (추상 메소드가 1개입니다.)
     * 2. 정렬이 필요한 객체들은 Comparable 인터페이스의 구현클래스 객체여야 합니다.
     */
    
  }
  
  public static void main(String[] args) {
    // mutable();
    // immutable();
    // traversal();
    sort();

  }

}
