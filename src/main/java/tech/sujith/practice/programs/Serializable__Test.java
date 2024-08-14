package tech.sujith.practice.programs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import lombok.Data;

public class Serializable__Test {
	public static void main(String[] args) {

//		Cat cat = new Cat();
//		cat.setName("Cruda");
//		cat.setColor("Black");
//		cat.setAge(12);
		
		String fileName = "cruda.txt";
		
		//writeObject(fileName, cat);
		
		Cat object = readObject(fileName, Cat.class);
		System.out.println(object);
		
	}

	public static void writeObject(String fileName, Object object) {
		// Serialize the object to a file
		try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
			outputStream.writeObject(object);
			System.out.println("Object serialized successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static <T> T readObject(String fileName, Class<T> readObjectClass) {
		// Deserialize the object from the file
		T deserializedObj = null;
		try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("object.ser"))) {
			deserializedObj = (T) inputStream.readObject();

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return deserializedObj;
	}
}

@Data
class Cat implements Serializable {

	private static final long serialVersionUID = 2L;
	private String name;
	private String color;
	private int age;

}
