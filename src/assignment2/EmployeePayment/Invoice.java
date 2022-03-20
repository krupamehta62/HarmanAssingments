package assignment2.EmployeePayment;

public class Invoice implements Payable{


	String partNum;
	String partrDescription;
	int quantity;
	double priceperItem;

	public Invoice(String partNum, String partrDescription, int quantity, double priceperItem) {
		this.partNum = partNum;
		this.partrDescription = partrDescription;
		this.quantity = quantity;
		this.priceperItem = priceperItem;
	}

	public String getPartNum() {
		return partNum;
	}

	public void setPartNum(String partNum) {
		this.partNum = partNum;
	}

	public String getPartrDescription() {
		return partrDescription;
	}

	public void setPartrDescription(String partrDescription) {
		this.partrDescription = partrDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPriceperItem() {
		return priceperItem;
	}

	public void setPriceperItem(double priceperItem) {
		this.priceperItem = priceperItem;
	}

	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		return quantity*priceperItem;
	}





}
