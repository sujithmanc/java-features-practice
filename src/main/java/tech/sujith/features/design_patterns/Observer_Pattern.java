package tech.sujith.features.design_patterns;

import java.util.ArrayList;
import java.util.List;

public class Observer_Pattern {
	public static void main(String[] args) {
		Role r = new Role();
		Account a = new Account();
		Id id = new Id();
		
		UserSubject us = new UserSubject();
		us.addObserver(r);
		us.addObserver(a);
		us.addObserver(id);
		
		us.createUser(34343);
	}
}

interface Observer{
	public void update(Integer userId);
}


interface Subject{
	public void addObserver(Observer observer);
	public boolean removeObserver(Observer observer);
	public void notifyObservers();
}

class UserSubject implements Subject {
	
	private int userId;
	private List<Observer> observers = new ArrayList<>();
	
	public void createUser(int id) {
		this.userId = id;
		notifyObservers();
	}
	
	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);		
	}

	@Override
	public boolean removeObserver(Observer observer) {
		return observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		observers.forEach(ob -> ob.update(userId));
	}
}

class Role implements Observer{

	@Override
	public void update(Integer userId) {
		System.out.printf("Role is created : %d%n", userId);
	}
}

class Account implements Observer{

	@Override
	public void update(Integer userId) {
		System.out.printf("Account is created : %d%n", userId);
	}
}

class Id implements Observer{

	@Override
	public void update(Integer userId) {
		System.out.printf("Id is created : %d%n", userId);
	}
}



