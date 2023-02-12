package spring1;

public class Customer
{
	 int customerId;
	 String customerName;
	 String customerContact;
     Address customerAddress;
	
        //Parameterized constructor
		public Customer(int customerId, String customerName, String customerContact, Address customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
	}
		
		//default constructor
		public Customer() {
			super();
			
		}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		//System.out.println("Setting customer id");
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		//System.out.println("Setting customer name");
		this.customerName = customerName;
	}
	public String getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(String customerContact) {
		//System.out.println("Setting customer contact");
		this.customerContact = customerContact;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		//System.out.println("Setting customer address");
		this.customerAddress = customerAddress;
	}
	
	public void displayCustomer() {
		System.out.println("Customer Id : " + customerId + " customer Name: " + customerName + " Customer contact : " + customerContact + " Customer Address: " + customerAddress);
	}
}
