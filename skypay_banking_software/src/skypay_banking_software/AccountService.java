package skypay_banking_software;

//the interface and its methods
public interface AccountService{
  void deposit(int amount);
  void withdraw(int amount) throws WithdrawException;
  void printStatement();
}
