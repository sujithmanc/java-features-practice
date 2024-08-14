package tech.sujith.practice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Bank {
	private String name;

	public Bank(String name) {
		super();
		this.name = name;
	}
	
	
}
