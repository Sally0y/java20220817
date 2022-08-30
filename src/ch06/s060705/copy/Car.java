package ch06.s060705.copy;

public class Car {
	
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car() {
	}
	
	Car(String model) {
		this(model, "은색", 250);
	}
	
	Car(String model, String color) {
		this(model, "은색", 250);
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model; 
		this.color = color;
		this.maxSpeed = 250;
	}

}
