package week1.day2;

public class MyMobile {

	String brandName="Samsung";
	float screenSize=5.7f;
	int cost=20000;
	private static String brandName2;
	
	public void makeCalls() {
		System.out.println("Making calls");
	}
	
	public void sendMsg() {
		System.out.println("Sending messages");

	}
	
	private void payBill() {
		System.out.println("Pay bills");

	}
	public static void main(String[] args) {
		MyMobile samsung=new MyMobile();
		String brandName1 = samsung.brandName;
		int costS = samsung.cost;
		float screenSize2 = samsung.screenSize;
		System.out.println("cost is : "+ costS);
		samsung.makeCalls();
		samsung.sendMsg();
		samsung.payBill();

	}

}
