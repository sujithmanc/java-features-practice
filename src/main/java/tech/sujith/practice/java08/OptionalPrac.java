package tech.sujith.practice.java08;

import java.util.Optional;

import lombok.Data;
import tech.sujith.practice.exception.CustomException;

@Data
class User {
	Addr addr;
}

@Data
class Addr {
	Street street;
}

@Data
class Street {
	String pin;
}

public class OptionalPrac {

	public static void main(String... args) {
		var z = new OptionalPrac();
		z.toUpperMethod();
	}

	public void toUpperMethod() {

		// Not using Optional class
		boolean usingOptional = true;
		String value = "sujith";
		
		if (usingOptional) {
			String result = Optional.ofNullable(value).orElseThrow(CustomException::new).toUpperCase();
			System.out.println("Result using optional: " + result);
		} else {
			String result = "";
			try {
				result = value.toUpperCase();
			} catch (NullPointerException exception) {
				throw new CustomException();
			}
			System.out.println("Result not using optional: " + result);
		}
		
	}

	public String preV8() {
		User user = getUser();
		if (user != null) {
			Addr address = user.getAddr();
			if (address != null) {
				Street street = address.getStreet();
				if (street != null) {
					String pin = street.getPin();
					if (pin != null) {
						return pin;
					}
				}
			}
		}
		return "not specified";
	}

	public String postV8() {
		User user = getUser();
		Optional<User> optnUser = Optional.ofNullable(user);
		return optnUser.map(u -> u.getAddr()).map(a -> a.getStreet()).map(s -> s.getPin()).orElse("not specified");
	}

	public String postV8With() {
		User user = getUser();
		Optional<User> optnUser = Optional.ofNullable(user);
		return optnUser.map(User::getAddr).map(Addr::getStreet).map(Street::getPin).orElse("not specified");

		// u -> u.getEx(); ==> U::getEx
	}

	private User getUser() {
		User user = new User();
		Addr addr = new Addr();
		// Street street = new Street();
		user.setAddr(addr);
		// addr.setStreet(street);
		// street.setPin(null);
		return user;
	}
}
