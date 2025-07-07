package chap06_BankAccount;

public class WithdrawalException extends Exception{
  
  @java.io.Serial
  private static final long serialVersionUID = 1L;
  
  public WithdrawalException(String message) {
    super(message);
  }

}
