class OddFib{
static int OddFi(int n) {
	n=(3*n+1)/2;
	int a=-1,b=1,c=0,i;
	for(i=1;i<=n;i++)
	{
		c=a+b;
		a=b;
		b=c;
	}
	return c;
}

	public static void main(String[] args) {
		
     int n=100;
     System.out.println(OddFi(n));
	}

}
