package tech.sujith.practice.string.faker;

import java.util.Locale;

import com.github.javafaker.Faker;

public class EmployeeFaker {
	public static void main(String[] args) {
		Faker faker = new Faker(new Locale("in")); // You can specify other locales like "en-US", "fr", etc.

		// Generate fake data
		String name = faker.name().fullName();
		String address = faker.address().fullAddress();
		String phoneNumber = faker.phoneNumber().cellPhone();
		
		String job = faker.job().title();

		// Print the fake data
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
		System.out.println("Job: " + job);
		System.out.println("Phone Number: " + phoneNumber);
	}
}
