package by.khmara.epam.mod04.task12;

public class Wheel {
	
	private double diametr;
	private boolean isBroken;
	
	Wheel(double diametr) {
		this.diametr = diametr;
		isBroken = false;
	}
	
	public double getDiametr() {
		return diametr;
	}
	
	public void setDiametr(double diametr) {
		this.diametr = diametr;
	}
	
	public boolean getIsBroken() {
		return isBroken;
	}
	
	public void setIsBroken() {
		this.isBroken = false;
	}
	
	void brokeWheel() {
		isBroken = true;
	}
}
