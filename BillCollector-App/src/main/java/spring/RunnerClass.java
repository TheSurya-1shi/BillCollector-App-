package spring;

public class RunnerClass {
	
	public static void main(String[] args) {
    	BillCollector bc = new BillCollector();
//		bc.payBill(1000);
		bc.setIPayment(new Upi()); // this is called Setter injection.
//		bc.payBill(1200);
		//BillCollector bc = new BillCollector(new DebitCard());
	//	BillCollector bc1 = new BillCollector(new Upi());
	//	bc1.payBill(3333);
		bc.payBill(12345);
	}

}
