package tech.sujith.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class BoxDto {

	private int value;
	
	@Override
	public boolean equals(Object obj) {
		
		BoxDto o2 = (BoxDto) obj;
		System.out.println("Inside equals--- " + o2.value + ", "  + value);
		return value == o2.value;
	}
	
	@Override
	public int hashCode() {
		System.out.println("Inside hashCode--- " + value);
		return value;
	}
}
