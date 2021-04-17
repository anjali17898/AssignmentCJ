package pack1;

public class Address {
	
	private String addressLine;
	private String cityType;
	
	public Address() {
		addressLine="Ist Main HSR Layout";
		cityType="Bangalore";
	}
	
	
   public Address(String addressLine, String cityType) {
		super();
		this.addressLine = addressLine;
		this.cityType = cityType;
		
		
	}


public String getAddressLine() {
	return addressLine;
}


public void setAddressLine(String addressLine) {
	this.addressLine = addressLine;
}


public String getCityType() {
	return cityType;
}


public void setCityType(String cityType) {
	this.cityType = cityType;
}
 public void getAddressDetails() {
	 System.out.println(addressLine+","+cityType);
	
	}

}