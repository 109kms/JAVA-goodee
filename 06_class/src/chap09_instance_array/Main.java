package chap09_instance_array;

import javax.swing.JOptionPane;

public class Main {

  public static void main(String[] args) {

    // Product 진열하기
    Product product1 = new Product("양파1.5kg", 3000);
    Product product2 = new Product("고등어1손", 5000);
    Product product3 = new Product("한돈앞다리", 15000);
    Product product4 = new Product("블랙앵거스살치살500g", 20000);
    Product product5 = new Product("꼬마돈까스", 9000);
    
    // Cart 진열하기
    Cart cart1 = new Cart(); // 비어있는 카트입니다.
    Cart cart2 = new Cart(); // 비어있는 카트입니다.
    
    // Customer 입장
    Customer customer = new Customer(50000);
    
    // Customer가 Cart 취득
    customer.setCart(cart1);
    
    // 쇼핑
    customer.addToCart(product2);
    customer.addToCart(product3);
    customer.addToCart(product4);

  }

}
