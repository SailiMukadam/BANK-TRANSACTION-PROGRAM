class Account
{
int acctno;
String acctname;	
double balance;

	void getdata(int c,String d,double e)
       {
        acctno=c;
        acctname=d;
        balance=e;
       }
       void putdata()
     {
 System.out.println("Account no :" +acctno);
 System.out.println("Account name :" +acctname);
}
	public void deposit(double amount)
	{
		balance = balance + amount;
	}

	public void withdraw(double amount)
	{
		balance = balance - amount;
	}

	public double getBalance()
	{
		return balance;
	}

}

class Test
{
public static void main (String args[])
{
Account a1= new Account();
Account a2= new Account();
a1.getdata(01,"KELP",0);
a2.getdata(02,"FTVP",0);
a1.deposit(10000);
a2.deposit(10000);
a1.withdraw(1000);
a2.withdraw(2000);
a1.putdata();
a2.putdata();
System.out.println(a1.getBalance());
System.out.println(a2.getBalance());

}
}

