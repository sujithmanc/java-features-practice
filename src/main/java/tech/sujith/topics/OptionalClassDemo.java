package tech.sujith.topics;

import java.util.List;
import java.util.Optional;

import lombok.Data;

@Data
class City {
	private Showroom showroom;
}

@Data
class Showroom {
	private List<Car> cars;
}

@Data
class Car {
	private Engine engine;
}

@Data
class Engine {
	private int horsePower;
}

public class OptionalClassDemo {
	public static void main(String[] args) {
		Optional<City> city = getCity();

		boolean present = city.filter(c -> c.getShowroom() != null).filter(c -> c.getShowroom().getCars() != null)
				.isPresent();
		System.out.println(present);

		boolean present2 = city.map(c -> c.getShowroom()).map(c -> c.getCars()).isPresent();

		System.out.println(present2);

		// Avoid clumsy if statements using optional class.
		Integer orElse = city // city2 != null
				.map(c -> c.getShowroom()) // city2.getShowroom() != null
				.map(c -> c.getCars()) // city2.getShowroom().getCars() != null)
				.map(c -> c.get(0)) // city2.getShowroom().getCars().get(0) != null)
				.map(c -> c.getEngine()) // city2.getShowroom().getCars().get(0).getEngine() != null)
				.map(c -> c.getHorsePower()) // city2.getShowroom().getCars().get(0).getEngine().getHorsePower() != null)
				.orElse(0);

		System.out.println(orElse);

		City city2 = getCity2();
		if (city2 != null && city2.getShowroom() != null && city2.getShowroom().getCars() != null) {
			List<Car> cars = city2.getShowroom().getCars();
			Car car = cars.get(0);
			System.out.println(car);
		} else {
			System.out.println("Something went wrong");
		}

	}

	public static City getCity2() {
		City city = new City();
		Showroom showRoom = new Showroom();
		Car c = new Car();
		Engine e = new Engine();
		e.setHorsePower(1234);
		c.setEngine(e);
		showRoom.setCars(null);
		city.setShowroom(showRoom);
		return city;

	}

	public static Optional<City> getCity() {
		City city = new City();
		Showroom showRoom = new Showroom();
		Car c = new Car();
		Engine e = new Engine();
		//e.setHorsePower(1234);
		c.setEngine(e);
		showRoom.setCars(List.of(c));
		city.setShowroom(showRoom);
		return Optional.ofNullable(city);

	}
}
