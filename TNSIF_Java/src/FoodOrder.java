

public class FoodOrder {

	public static void main(String[] args) {
	
		int orderId = 101;
		double price=299.99;
		boolean isDelivered=false;
		char rating='A';
		float deliveryDistance=5.3f;
		long deliveryBoyphone=765784232;
		byte deliverTime=45;
		short resturantId=12;
		
		String customerName="Anjali";
		String[] foodItem= {"Burger","Fries","Coke"};
		
		System.out.println("Order Summary");
		System.out.println("Customer Name:"+customerName);
		System.out.println("Order Id:"+orderId);
		System.out.println("ResturantId:"+resturantId);
		System.out.println("Delivery Boy Content:"+deliveryBoyphone);
		System.out.println("Food items:");
		for(String item:foodItem) {
			System.out.println("-"+rating);
		}
		System.out.println("Total Price:"+price);
		System.out.println("DeliveryDistance:"+deliveryDistance);
		System.out.println("Expected Time:"+deliverTime);
		System.out.println("Delivery status:"+isDelivered);
		System.out.println("Rating:"+rating);
		
		
	}
}
