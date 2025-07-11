package chap04_InputStream;

/*
 * java.io.InputStream
 * 
 * 1. 바이트 기반 입력 스트림의 최상위 추상 클래스입니다.
 * 2. 파일, 네트워크 등으로부터 바이트 단위로 데이터를 읽어올 수 있습니다.
 * 3. 주요 하위클래스
 *    1) FileInputStream
 *    2) BufferedInputStream
 *    3) DataInputStream
 * 4. 주요 메소드
 *    1) int read() : 1바이트를 읽어 int 값으로 반환 (읽을 데이터가 없으면 -1(EOF)을 반환)
 *                   (1바이트를 int로 변환하면 0~255 값으로 반환되는데 이렇게 처리하면 -1(EOF)과 변환하는 값의 차이를 만들 수 있습니다.)
 *                   (1바이트를 byte로 그대로 반환하면 -128~127 값으로 반환하는데 이러면 -1(EOF)와 반환하는 값의 구분이 어렵습니다.)
 *    2) int read(byte[] b) : 전달한 바이트 배열만큼 읽어서 배열에 저장 (읽은 데이터는 byte[] b에 저장됩니다.)
 *                            실제로 읽은 바이트 수를 반환합니다.
 *                            (읽을 데이터가 없으면 -1(EOF)을 반환)
 *    3) int read(byte[] b, int off, int len) : 전달한 바이트 배열의 일부만 사용해서 저장(인덱스 off부터 len개 만큼)
 *                                              실제로 읽은 바이트 수를 반환합니다.
 *                                              (읽을 데이터가 없으면 -1(EOF)을 반환)
 *    4) close() : 입력 스트림을 닫고 자원을 해제
 */

public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

}
