
public class Calculator {
	public static void main(String args[])
	{
		Calc c = new Calc();
		int n3=c.sum(20, 10);
		System.out.println("sum is "  +n3);
		n3=c.sub(20, 10);
		System.out.println("sub is " +n3);
		n3=c.mul(20, 10);
		System.out.println("mul is " +n3);
		n3=c.div(20, 10);
	    System.out.println("div is " +n3);
		
	}

}
