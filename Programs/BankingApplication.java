class Account {
    private int acno;
    private String name;
    protected float balance;
    public Account(int acno, String name, float balance) {
        super();
        this.acno = acno;
        this.name = name;
        this.balance = balance;
    }
    public Account() {
        super();
    } // default constructor

    public int getAcno() {
        return acno;
    }
    public void setAcno(int acno) {
        this.acno = acno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getBalance() {
        return balance;
    }
    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void display () {
        System.out.println(acno+" "+name+" "+balance);
    }

    public void withdraw(float amt){
        balance -= amt;
    }
    public void deposit(float amt) {
        balance +=amt;
    }
}

class SavingsAccount extends Account{
    private String nominee;
    public SavingsAccount(int acno, String name, float balance ,String nominee) {
        super(acno, name, balance); //super class constructor must be called before
        this.nominee = nominee;
    }
    public void withdraw(float amt) {
        if(balance - amt > 2500) {
            balance -= amt;
        } else {
            System.out.println("Insuffecient balance");
        }
    }
    public void display() {
        super.display();
        System.out.println(nominee);
    }
}
public class BankingApplication {

    public static void main (String[] args) {
        Account sa = new SavingsAccount(156,"Tejas",40000,"Sagar");
                sa.display();
        // String a = "1";
        // if(((Object)a).getClass().getName().equals("java.lang.String")){
        //   System.out.println("Success");
        // }
        // else
        // {
        //   System.out.println("Fail");
        // }
    }
}
