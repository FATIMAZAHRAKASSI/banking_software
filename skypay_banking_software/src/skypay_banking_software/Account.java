package skypay_banking_software;
import java.util.*;
import java.text.SimpleDateFormat;
public class Account implements AccountService{
    private int balance=0;//the balance
    //the transactions that this account did
    private List<Transaction> transactions;
    //constructor
    Account(int balance)
    {
        this.balance=balance;
        this.transactions=new ArrayList<Transaction>();
    }
    //getter
    public int getbalance()
    {
        return balance;
    }
    
    //implementation of methods from the interface
    @Override
    public void deposit(int amount)
    {
    	//it doesn't make sense if the deposit amount is not greater than 0
        if(amount<=0)
        {
            throw new IllegalArgumentException("Amount should be positive");
        }
        balance+=amount;//add the desired amount to the balance
        //add this new transaction to our list of transactions
        this.transactions.add(0,new Transaction(new Date(),balance,amount));
    }
    @Override
    public void withdraw(int amount) throws WithdrawException
    {
    	//it doesn't make sense if the withdraw amount is not greater than 0
        if(amount<=0)
        {
            throw new IllegalArgumentException("Amount should be positive");
        }
        //the amount withdrawed should be smaller than the balance
        if(amount>balance)
        {
            throw new WithdrawException("Balance not sufficent for withdraw!");
        }
        //withdraw the amount
        balance-=amount;
        //add this new transaction to our list of transactions
        this.transactions.add(0,new Transaction(new Date(),balance,-amount));//store as negative value for display
    }
    @Override
    public void printStatement()
    {
        System.out.println("Date       || Amount        || Balance");
        //the date is a Date object that's why it should formatted to a more understandable format for the display
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
        for(Transaction t:transactions)
        {
            System.out.println(formatter.format(t.getdate())+"       || "+t.getamount()+"        || "+t.getbalance());
        }
    }
}

