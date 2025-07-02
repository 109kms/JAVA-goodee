package chap09_instance_array;

import javax.swing.JOptionPane;

public class Customer {
  
  // 필드
  private int money;
  private Cart cart;
  
  // 생성자
  public Customer(int money) {
    this.money = money;
  }
  
  // 메소드
  public int getMoney() {
    return money;
  }

  public void setMoney(int money) {
    this.money = money;
  }

  public Cart getCart() {
    return cart;
  }

  public void setCart(Cart cart) {
    this.cart = cart;
  }
  
  public void addToCart(Product product) {
    if(cart == null) {
      JOptionPane.showMessageDialog(null, "cart를 먼저 준비하세요.");
      return;
    }
    cart.addProduct(product);
  }

}
