package tech.sujith.features.records;

public record PersonRec(String name, String age) {

	public PersonRec {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
	
}
