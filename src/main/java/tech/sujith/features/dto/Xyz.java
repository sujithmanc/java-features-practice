package tech.sujith.features.dto;

import lombok.ToString;

@ToString
public class Xyz {

	private final int value;

	public Xyz(int value) {
		this.value = value;
	}

	public static int getStastic() {
		return 404;
	}

	public int getInstance() {
		return value;
	}

}