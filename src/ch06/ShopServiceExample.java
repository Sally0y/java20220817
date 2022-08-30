package ch06;

public class ShopServiceExample {
	public static void main(String[] args) {
		ShopService obj1 = Shopservice.getInstance();
		ShopService obj2 = Shopservice.getInstance();
		
		if(obj == obj2) {
			System.out.println("같은 ShopService 객체 입니다.");
		} else {
			System.out.println("다른 ShopService 객체 입니다.");
		}
	}
}
