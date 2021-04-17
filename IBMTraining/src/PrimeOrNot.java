
public class PrimeOrNot {

	public static int isPrime(int x) {
		int i;
		for(i=2;i<=x/2;i++)
		{
			if(x%i==0) {
				return 0;
			}
		}
         return 1;
	}
	
	public static void main(String[] args)
	{
		if(args.length>0) {
			int n=Integer.parseInt(args[0]);
			if(isPrime(n)==1)
				System.out.println("no. is prime");
			else
				System.out.println("no. is not prime");
		}
		else
			System.out.println("no arguement found");
	}

}
