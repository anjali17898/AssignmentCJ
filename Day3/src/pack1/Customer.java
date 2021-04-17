package pack1;

public class Customer {
	private String customerName;
	private String residentialAddress;

	public Customer(String customerName, String residentialAddress) {
		super();
		this.customerName = customerName;
		this.residentialAddress= residentialAddress;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public void getCustomerDetails() {
		System.out.println("Name: "+customerName+"\nResidential Address: "+residentialAddress);
	}
	public static void main(String[] args) {
		Customer cust=new Customer("john","Ist Main HSR Layout");
		
		cust.getCustomerDetails();
	}

}