package pack2;
import java.util.Scanner;


public class BookDetails {

	public static void main(String[] args) {
		EngineeringBook book1=new EngineeringBook();

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Book No");
		book1.setBookNo(sc.nextInt());//C
		sc.nextLine();
		System.out.println("Enter Book Title");
		book1.setTitle(sc.nextLine());
		System.out.println("Enter Author Name");
		book1.setAuthor(sc.nextLine());//c
		System.out.println("Enter Book Price");
		book1.setPrice(sc.nextFloat());

		//EngineeringBook ebook=new EngineeringBook();
		System.out.println("Enter Book category");
		book1.setCategory(sc.next());
		
		System.out.println("op");
		
		System.out.println(book1.getBookNo());
		System.out.println(book1.getTitle());
		System.out.println(book1.getAuthor());
		System.out.println(book1.getPrice());
		System.out.println(book1.getCategory());
		
	}
}
