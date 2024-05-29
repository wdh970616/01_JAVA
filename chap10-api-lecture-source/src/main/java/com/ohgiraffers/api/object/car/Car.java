package com.ohgiraffers.api.object.car;

public class Car {
    private String carName;
    private String carColor;
    private int engineCC;

    @Override
    public boolean equals(Object obj) {
        // 두 인스턴스의 주소가 같으면 true
        if (this == obj) return true;

        // 매개변수가 null이거나 매개변수로 받아온 obj와 비교했을때 타입이 같지않으면 false
        if (obj == null || getClass() != obj.getClass()) return false;

        // 다른 필드들을 비교해서 같지 않으면 false 같으면 true
        Car car = (Car) obj;
        return this.carName.equals(car.carName) &&
                this.carColor.equals(car.carColor);
    }

    @Override
    public int hashCode() {
        // hashCode값이 필드값에 의해 출력되도록 오버라이딩
        int result = 1;
        final int PRIME = 31;
        result = PRIME * result + this.carName.hashCode();
        result = PRIME * result + this.carColor.hashCode();
        return result;
    }

    public Car() {
    }

    public Car(String carName, String carColor, int engineCC) {
        this.carName = carName;
        this.carColor = carColor;
        this.engineCC = engineCC;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public int getEngineCC() {
        return engineCC;
    }

    public void setEngineCC(int engineCC) {
        this.engineCC = engineCC;
    }
}
