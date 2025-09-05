package ch06;

public class Car4 {
    // 필드 선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    // 생성자 1
    Car4() {}

    // 생성자 2
    Car4(String model) {
        this.model = model;
    }

    // 생성자 3 
    Car4(String model, String color) {
        this.model = model;
        this.color = color;
    }

    // 생성자 4
    Car4(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
