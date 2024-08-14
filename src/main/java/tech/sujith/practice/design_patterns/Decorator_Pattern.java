package tech.sujith.practice.design_patterns;

public class Decorator_Pattern {
	public static void main(String[] args) {
		Laptop l = new LenovaLaptop();
		System.out.println(l.getRam() + " : "+l.getClockSpeed());
		
		l = new RamEnhancer(l);
		System.out.println(l.getRam() + " : "+l.getClockSpeed());
	}
}

interface Laptop {
	public int getRam();

	public double getClockSpeed();
}

class LenovaLaptop implements Laptop {
	@Override
	public int getRam() {
		return 8;
	}

	@Override
	public double getClockSpeed() {
		return 3.1;
	}
	
	@Override
	public String toString() {
		return getRam() + " : " + getClockSpeed();
	}
}

// Decorator = Enhancer
abstract class LaptopEnhancer implements Laptop {
	private Laptop laptop;

	public LaptopEnhancer(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public int getRam() {
		return laptop.getRam();
	}

	@Override
	public double getClockSpeed() {
		return laptop.getClockSpeed();
	}
}

class RamEnhancer extends LaptopEnhancer {

	public RamEnhancer(Laptop laptop) {
		super(laptop);
	}

	@Override
	public int getRam() {
		return super.getRam() + 8;
	}
}

class ProcessorEnhancer extends LaptopEnhancer {

	public ProcessorEnhancer(Laptop laptop) {
		super(laptop);
	}

	@Override
	public double getClockSpeed() {
		return super.getClockSpeed() + 1;
	}

}
