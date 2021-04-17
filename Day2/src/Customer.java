
public class Customer {
	int custId;
	String custName;

public Customer() {
	custId = 100;
	custName="Anjali";
}
	public static void main(String[] args)
	{
		Customer cust=new Customer();
		System.out.println("name :"+cust.custName+"\nid: "+cust.custId);
	}
	
}
