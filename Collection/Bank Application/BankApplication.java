import java.util.HashMap;
import java.util.ArrayList;
import java.util.Set;

class Transaction
{
    private int id;
    private String type; //withdraw,deposit
    private double amount;

    public Transaction(){}

    public Transaction(int id , String type , double amount)
    {
        this.id = id;
        this.type = type;
        this.amount = amount;
    }

    public String toString()
    {
        return id + " " + type + " " + amount;
    }
}
public class BankApplication
{
      public static void main(String args[])
      {
          HashMap <Integer,ArrayList<Transaction>> hashMap = new HashMap<>();
          Transaction mTransaction = new Transaction(1,"Deposit",2000);
          Transaction nTransaction = new Transaction(2,"Withdraw",3000);
          ArrayList<Transaction> arrayList = new ArrayList<>();
          arrayList.add(mTransaction);
          arrayList.add(nTransaction);
          hashMap.put(101 , arrayList);
          Set <Integer> keys = hashMap.keySet();
          for(Integer key : keys)
          {
              System.out.println(key);
              ArrayList <Transaction> transactionList = hashMap.get(key);
              for(Transaction transaction : transactionList)
              {
                  System.out.println(transaction);
              }
              System.out.println("-------------------------------------------------");
          }
      }
}
