package week2.org.system;

public class Desktop extends Computer
{
	public void desktopSize()
	{
		System.out.println("Its a child class ds");
	}
	public static void main(String[] args) 
	{
		Desktop d=new Desktop();
		d.desktopSize();
		d.computerModel();
	}
}
