
public class gcd5 {
	public static void main(String args[])
	{
		int m=60;
		int n=50;
		int min=60<50?m:n;
		while(min>=2) {
		if ((m%min==0) && (n%min==0)) {
			System.out.print(min);
			break;
		}
		min--;
	}
	}
}
