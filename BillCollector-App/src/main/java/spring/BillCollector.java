package spring;

public class BillCollector {
	
	private IPayment payment =null;
	
	
	public void setIPayment(IPayment payment) {
		this.payment=payment;
	}
	
	public BillCollector() {
		
	}
	
	public BillCollector(IPayment payment) {
		this.payment=payment;
	}
	
	public int payBill(double amount) {
//		payment = new CreditCard(); we can do it this way but this will be tightly coupling of the classes. which we 
//		payment = new DebitCard(); want to avoid as per strategy design pattern.
		String ret = payment.pay();
		System.out.println(ret);
		
		return 1;
	}

}
