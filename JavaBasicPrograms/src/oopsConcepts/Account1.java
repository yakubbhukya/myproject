package oopsConcepts;


	public class Account1{
		int acc_no;
		String name;
		float amount;
		void insert(int a,String n,float amt) {
			acc_no=a;
			name=n;
			amount=amt;
		}
		void deposit(float amt) {
			amount=amount+amt;
			System.out.println(amt +"Deposited");
		}
		void withdraw(float amt)
		{
			if(amount<amt) {
				System.out.println("Insufficient   Balance");											}
		
	else 
		amount=amount-amt;
				System.out.println(amt+"Withdrawn");
	}
	void checkBalance()
	{
		System.out.println("Balance is:" +amount);
	}
	void display() {
		System.out.println(acc_no+""+name+""+amount);
		
	}
	
	}


