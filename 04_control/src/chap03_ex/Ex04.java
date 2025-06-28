package chap03_ex;

public class Ex04 {

  public static void main(String[] args) {
    
    // 점수와 학년에 따른 합격 여부를 출력하세요.
    // 대학 1~2학년은 60점 이상이면 "합격"이고, 3~4학년은 70점 이상이어야 "합격"입니다.
    
    int score = 66;
    int grade = 3;
    int cutline = 0;
    
    if(grade >= 3) {
      cutline = 70;
    } else {
      cutline = 60;
    }
    boolean passed = score >= cutline;
    System.out.println(passed ? "합격" : "불합격");
    

  }

}
