package chap01_is_a;

public class Main {

  public static void main(String[] args) {

    //----- Student
    Student student = new Student();
    student.eat();
    student.sleep();
    student.study();
    
    //----- Worker
    Worker worker = new Worker();
    worker.startWork();
    worker.finishWork();
    
    //----- Developer
    Developer developer = new Developer();
    developer.develop();
    developer.eat();
    developer.finishWork();
    developer.startWork();
       
    //----- Designer
    Designer designer = new Designer();
    designer.design();
    designer.eat();
    designer.finishWork();

  }

}
