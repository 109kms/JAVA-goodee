package chap09_interface.e_marker_interface;

public class Sashimi implements Food, FavoriteFood{

  @Override
  public void howToEat() {
    // TODO Auto-generated method stub
    System.out.println("간장에 와사비 넣어서 먹어야함.");
  }
}
