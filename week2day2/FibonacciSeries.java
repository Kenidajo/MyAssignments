package week2day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int range=8,a=0,b=1,sum;
System.out.println("Fibonacci Series");
for (int i = 0; i <range; i++) {
	System.out.println("Fibonacci series:" +a);
	sum=a+b;
	
	a=b;
	b=sum;
	
}

	}

}
