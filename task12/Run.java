package by.khmara.epam.mod04.task12;

public class Run {

	public static void main(String[] args) {

		Car kia = new Car("kia ceed");
		
		Engine engine = new Engine(150);
		kia.setEngine(engine);
		kia.setWheels(new Wheel(17), new Wheel(17), new Wheel(17), new Wheel(17));
		
		kia.getWheels().get(2).brokeWheel();
		kia.changeWheels(kia.getWheels());
		kia.fillFuel();
		kia.run();
		
		System.out.println(kia.getModel());
	}

}
