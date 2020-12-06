package by.khmara.epam.mod04.task12;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Car {

	private boolean isFuelFull;
	private ArrayList<Wheel> wheels;
	private String model;
	private Engine engine;

	Car(String model) {
		this.model = model;
		this.isFuelFull = false;

	}

	void fillFuel() {
		isFuelFull = true;

		System.out.println("Машина заправлена");
	}

	void changeWheels(ArrayList<Wheel> wheels) {

		for (Wheel wh : wheels) {

			if (wh.getIsBroken()) {
				System.out.println("Колесо №" + wheels.indexOf(wh) + " заменено");
				wh.setIsBroken();

			}
		}
	}

	void setEngine(Engine engine) {
		this.engine = engine;
		System.out.println("Двигатель установлен");
	}

	void setWheels(Wheel w1, Wheel w2, Wheel w3, Wheel w4) {
		this.wheels = new ArrayList();
		this.wheels.add(w1);
		this.wheels.add(w2);
		this.wheels.add(w3);
		this.wheels.add(w4);

		System.out.println("Колеса установлены");
	}

	void run() {

		int wheelCounter = 0;
		int wheelBroken = 0;
		boolean isEngine = false;

		for (Wheel wh : wheels) {
			if (wh != null) {
				wheelCounter++;
			}
			if (wh.getIsBroken()) {
				wheelBroken++;
			}
		}

		if (engine == null) {
			System.out.println("Установите двигатель в машину");
		} else {
			isEngine = true;
		}

		if (wheelCounter < 4) {
			System.out.println("Установите колеса на машину");
		}

		if (wheelBroken != 0) {
			System.out.println("Поменяйте колеса");
		}
		
		if (!isFuelFull) {
			System.out.println("Надо заправиться");
		}

		if (wheelBroken == 0 && wheelCounter == 4 && engine != null && isFuelFull) {
			System.out.println("Все готово, поехали!");
		}
	}

	public ArrayList<Wheel> getWheels() {
		return wheels;
	}
	
	public String getModel() {
		return model;
	}

}
