public class Product2 {
	private String productCode;
	private String productName;
	private double productPrice;

	public Product2(String productCode, String productName, double productPrice) {
		this.productCode = productCode;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	public void displayProductDetails() {
		System.out.println("ProductCode : "+productCode+"\nProductName : "+productName+"\nProductPrice : "+productPrice);
	}
}