import java.util.Scanner;
public class AdditionThreeNo {

	public static void main(String[] args) {
		int n1,n2,n3,sum;
		System.out.println("enter any three numbers: ");
		Scanner in=new Scanner(System.in);
        n1=in.nextInt();
        n2=in.nextInt();
        n3=in.nextInt();
        sum=n1+n2+n3;
        System.out.println("the result after addition is: "+sum);
	}

}
