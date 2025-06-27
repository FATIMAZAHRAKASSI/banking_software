package skypay_banking_software;

//this exception for : the amount withdrawed should always 
//be smaller than the balance in the account
public class WithdrawException extends Exception {
  public WithdrawException(String message) {
      super(message);
  }
}

