package skypay_banking_software;

//main class
public class TestClass {
	public static void main(String[] args) {
      Account a=new Account(0);//account object with a balance of 0
      try {
      	a.deposit(1000);
          a.deposit(2000);
          a.deposit(-5);//testing deposit of a non accepted value
      }catch (IllegalArgumentException e) {
              System.out.println(e.getMessage());
       } 
      try{
      a.withdraw(500);//testing withdraw normally
      //testing a withdraw of amount>balance
      a.withdraw(200000);
      }catch(WithdrawException e){
          System.out.println(e.getMessage());
      }
      catch (IllegalArgumentException e) {
          System.out.println(e.getMessage());
      } 
      a.printStatement();
      
  }
}
