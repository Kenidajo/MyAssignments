package week2.org.system;

public class AxisBank extends BankInfo{

	public void deposit()
	{
		System.out.println("Its a override child class deposit");
	}
	public static void main(String[] args) {
	AxisBank aba=new AxisBank();
	aba.deposit();
	}	
}
