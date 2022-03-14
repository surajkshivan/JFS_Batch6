package testinvoice;

public class invoice {
	private String id;
	private String desc;
	private int qty;
	private double unitPrice;
	
	public invoice(String id,String desc,int qty,double unitPrice) {
		this.id=id;
		this.desc=desc;
		this.qty=qty;
		this.unitPrice=unitPrice;
	}
	public String getid() {
		return id;
	}
public String getdesc() {
	return desc;
}
public int getqty() {
	return qty;
}
public void setqty(int qty) {
	this.qty=qty;
}
public double getunitPrice() {
	return unitPrice;
}
public void setunitPrice(double unitPrice) {
	this.unitPrice=unitPrice;
}
public double getTotal() {
	return unitPrice*qty;
}
public String  toString() {
	return "invoice[id="+this.id+",desc="+this.desc+",qty="+this.qty+",unitPrice="+this.unitPrice+"]";
	
}
	public static void main(String[] args) {
		invoice inv1 = new invoice("A101", "Pen Red", 888, 0.08);
		  System.out.println(inv1);
		   inv1.setqty(999);
		   inv1.setunitPrice(0.99);
		   System.out.println(inv1); 
		   System.out.println("id is: " + inv1.getid());
		    System.out.println("desc is: " + inv1.getdesc());
		    System.out.println("qty is: " + inv1.getqty());
		    System.out.println("unitPrice is: " + inv1.getunitPrice());
		    System.out.println("The total is: " + inv1.getTotal());
		

	}

}
