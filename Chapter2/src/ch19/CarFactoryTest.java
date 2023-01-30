package ch19;

public class CarFactoryTest {

	public static void main(String[] args) {
		
		CarFactory factory = CarFactory.getInstance();
		
		Car sonataCar = factory.createCar();
		Car misoCar = factory.createCar();
		
		System.out.println(sonataCar.getCarNum());
		System.out.println(misoCar.getCarNum());

	}

}
