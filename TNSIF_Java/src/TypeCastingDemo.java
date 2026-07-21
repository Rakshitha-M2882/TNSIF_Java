
public class TypeCastingDemo {

	public static void main(String[] args) {
		int quantity=3;
		double priceperItem=99.50;
		double totalprice=quantity*priceperItem;
		double discount=10.75;
		int roundedDiscount=(int)discount;
		double finalAmount=totalprice-roundedDiscount;
		
		System.out.println("Online Shopping Summary");
		System.out.println("items Bought"+quantity);
		System.out.println("Price per item"+priceperItem);
		System.out.println("Final Amount to pay after discount:"+finalAmount);

	}

}
