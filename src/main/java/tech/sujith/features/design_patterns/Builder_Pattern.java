package tech.sujith.features.design_patterns;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

public class Builder_Pattern {
	public static void main(String[] args) {
		 Pizza pizza = PizzaBuilder.start().dough("Dough").sauce("Sause").topping("Topping").build();
		 System.out.println(pizza);
		 
	}
	
}

@Getter
@AllArgsConstructor
@ToString
class Pizza {
	private String dough;
	private String sauce;
	private String topping;
}

class PizzaBuilder {
	private String dough;
	private String sauce;
	private String topping;

	public static PizzaBuilder start() {
		return new PizzaBuilder();
	}


	public Pizza build() {
		return new Pizza(dough, sauce, topping);
	}
	
	public PizzaBuilder dough(String dough) {
		this.dough = dough;
		return this;
	}
	
	public PizzaBuilder sauce(String sauce) {
		this.sauce = sauce;
		return this;
	}
	
	public PizzaBuilder topping(String topping) {
		this.topping = topping;
		return this;
	}
	
}
