package skypay_banking_software;
import java.util.*;
public class Transaction{
    private Date date;//date of transaction
    private int balance;//balance updated
    private int amount;//amount withdrawed or deposited
    //constructor
    Transaction(Date date, int balance, int amount)
    {
        this.date=date;
        this.balance= balance;
        this.amount=amount;
    }
    
    //getters
    int getbalance()
    {
        return balance;
    }
    Date getdate()
    {
        return date;
    }
    int getamount()
    {
        return amount;
    }
}

