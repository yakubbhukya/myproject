package oopsConcepts;


public class TestAccount {
public static void main(String[] args)
{
	Account1 a1=new Account1();
	a1.insert(1234," Ankit", 5000);
	a1.display();
	a1.checkBalance();
	a1.deposit(40000);
	a1.checkBalance();
	a1.withdraw(20000);
	a1.display();
	a1.checkBalance();
	
}
	
}