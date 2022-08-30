package ch06;

public class ShopService {
	private static ShopService ins = new ShopService();
	
	private ShopService() {}
	
	static ShopService getInstance() {
		return ins;
	}
	
	
}
