package tech.sujith.practice.design_patterns;

import java.util.ArrayList;
import java.util.List;

public class Observer__Design__Pattern__002 {
	public static void main(String[] args) {
		AO a = new AO();
		BO b = new BO();
		CO c = new CO();
		
		ASubject subs = new ASubject();
		subs.getObservers().addAll(List.of(a, b, c));
		subs.updateAll();
		
	}

}

class ASubject {
	private List<O> observers = new ArrayList<>();

	public List<O> getObservers() {
		return observers;
	}

	public void updateAll() {
		observers.forEach(o -> o.update());
	}
}

interface O {
	void update();
}

class AO implements O {

	@Override
	public void update() {
		System.out.println("Inside AO");
	}
}

class BO implements O {

	@Override
	public void update() {
		System.out.println("Inside BO");
	}
}

class CO implements O {

	@Override
	public void update() {
		System.out.println("Inside CO");
	}
}
