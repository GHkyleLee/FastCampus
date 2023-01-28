package ch14;

public class TakeTransTest {

	public static void main(String[] args) {
		
		Student studentJ = new Student("James", 5000);
		Student studentT = new Student("Tomas", 10000);

		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		
		Subway grenenSubway = new Subway(2);
		Subway redSubway = new Subway(1);
		
		studentJ.takeBus(bus100);
		studentJ.takeBus(bus500);
		studentT.takeBus(bus100);
		studentT.takeSubway(grenenSubway);
		
		studentJ.showInfo();
		studentT.showInfo();
		
		grenenSubway.showSubwayInfo();
		bus100.showBusinfo();
		bus500.showBusinfo();
		redSubway.showSubwayInfo();
	}

}
