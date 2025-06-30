package chap03_method_return;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    
    Return ret = new Return();
    ret.methodA(-1);
    ret.methodA(1);
    
    System.out.println("methodB: " + ret.methodB(1, 2));
    
    
    int[] numbers = ret.methodC(3);
    numbers = new int[] {1,2,3};
    System.out.println(Arrays.toString(numbers));
    
    String carInfo = ret.methodD();
    System.out.println("methodD's return: " + carInfo);  // 4000만원짜리 Sorento

  }

}
