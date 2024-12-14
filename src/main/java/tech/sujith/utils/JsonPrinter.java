package tech.sujith.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class JsonPrinter {
	// Private static ObjectMapper instance variable
	private static ObjectMapper objectMapper;

	// Private constructor to prevent instantiation from outside
	private JsonPrinter() {
	}

	// Public static method to get the ObjectMapper singleton instance
	public static ObjectMapper getObjectMapper() {
		// Lazy initialization
		if (objectMapper == null) {
			synchronized (JsonPrinter.class) {
				if (objectMapper == null) {
					objectMapper = new ObjectMapper();
					objectMapper.registerModule(new JavaTimeModule());
					// You can set additional configurations for objectMapper here if needed
				}
			}
		}
		return objectMapper;
	}

	// Method to print JSON string of an object
	public static String getJson(Object object) {
		try {
			return getObjectMapper().writeValueAsString(object);
		} catch (JsonProcessingException e) {
			return e.getMessage();
		}
	}

	// Method to print JSON string with pretty formatting
	public static String getJsonPretty(Object object) {
		try {
			return getObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(object);
		} catch (JsonProcessingException e) {
			return e.getMessage();
		}
	}

	// Method to print JSON string to console
	public static void printAsJson(Object object) {
		System.out.println(getJson(object));
	}

	// Method to print JSON string to console with pretty formatting
	public static void printAsJsonPretty(Object object) {
		System.out.println(getJsonPretty(object));
	}

	// Method to print JSON string to console with pretty formatting
	public static void printAsJsonPretty(String message, Object object) {
		System.out.println(message + ": " + getJsonPretty(object));
	}
}
