package chap02_multi_dimension;

import java.util.Arrays;

public class MultiDimensionEx {

  public static void main(String[] args) {

    // 2차원 배열이란?
    // 1차원 배열이 여러 개 존재하는 경우 이 1차원 배열을 합치는 것을 의미합니다.
    
    // 2차원 배열 선언
    String[][] seats;
    
    // 2차원 배열 생성 (1차원 배열을 만드는 작업)
    seats = new String[3][];  //----- 1차원 배열이 3개입니다.
    
    // 1차원 배열 생성 (1차원 배열의 길이를 만드는 작업)
    seats[0] = new String[2];  //----- 첫 번째 1차원 배열의 길이는 2입니다. seats[0]이 1차원 배열의 이름입니다.
    seats[1] = new String[5];  //----- 두 번째 1차원 배열의 길이는 5입니다. seats[1]이 1차원 배열의 이름입니다.
    seats[2] = new String[4];  //----- 세 번째 1차원 배열의 길이는 4입니다. seats[2]이 1차원 배열의 이름입니다.
    
    // 2차원 배열 요소 사용 (인덱스를 2개 사용 : 몇 번째 1차원 배열인가? 1차원 배열 내 몇 번째 요소인가?)
    seats[0][0] = "이동욱";
    seats[0][1] = "신성수";
    
    seats[1][0] = "이유천";
    seats[1][1] = "조기완";
    seats[1][2] = "최미영";
    seats[1][3] = "박진성";
    seats[1][4] = "김민석";
    
    seats[2][0] = "유비";
    seats[2][1] = "이창민";
    seats[2][2] = "권형택";
    seats[2][3] = "김경진";
    
    // 2차원 배열 순회 1 (일반 for문)
    for (int i = 0; i < seats.length; i++) {  //------- 각 1차원 배열 찾아가기
      for (int j = 0; j < seats[i].length; j++) {  //-- 찾아간 1차원 배열 요소 순회하기
        System.out.print(seats[i][j] + ",");
      }
      System.out.println();
    }
    
    
    // 2차원 배열 순회 2 (향상 for문)
    for (String[] rows : seats) {  // 2차원 배열이 가지고 있는 건 1차원 배열입니다.
      for (String seat : rows) {
        System.out.print(seat + ",");
      }
      System.out.println();
    }
   

  }

}
