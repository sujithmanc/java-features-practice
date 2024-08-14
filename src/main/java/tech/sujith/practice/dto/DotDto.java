package tech.sujith.practice.dto;

import lombok.Data;

@Data
public class DotDto {
	private int x;
	private int y;
	
	
	public DotDto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
}
