package Day3;

public class Customer {
private String customerName , customerCity;
private int customerId;

public Customer() {
	System.out.println("default Constructor");
}
public Customer(String customerName,String customerCity,int customerId){
	this();
	System.out.println("Parameterized constructor");
	this.customerName=customerName;
	this.customerCity=customerCity;
	this.customerId=customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getCustomerCity() {
	return customerCity;
}
public void setCustomerCity(String customerCity) {
	this.customerCity = customerCity;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
@Override
public String toString() {
	return "Customer [customerName=" + customerName + ", customerCity=" + customerCity + ", customerId=" + customerId
			+ "]";
}

}
