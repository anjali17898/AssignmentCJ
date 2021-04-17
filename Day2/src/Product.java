
public class Product {
	String ProductCode;
	String ProductName;
	double ProductPrice;
	
	public Product() {
		ProductCode="P101";
		ProductName="Laptop";
		ProductPrice=45000.00;}
		
		Product(String code, String name, double price)
		{
			this.ProductCode=code;
			this.ProductName=name;
			this.ProductPrice=price;
			
		}
		public void DisplayInfo() {
			ProductCode="P101";
			ProductName="Laptop";
			ProductPrice=45000.00;
		}
	

	public String getProductCode() {
		return ProductCode;
	}

	public void setProductCode(String P101) {
		ProductCode = P101;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public double getProductPrice() {
		return ProductPrice;
	}

	public void setProductPrice(double productPrice) {
		ProductPrice = productPrice;
	}

	public static void main(String[] args) {
		Product prod= new Product("P101","tv",45000.00);
		String ProductName=prod.getProductName();
		System.out.println("name:"+ProductName);
		prod.DisplayInfo();
	}

}
