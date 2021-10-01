package design_pattern.builder_design_pattern;

public class MealBuilder {
	 Meal m = new Meal();
	
	MealBuilder getLiquidMeal(Item i) {
		m.addItem(i);
		return this;
	}

	MealBuilder getSolidMeal(Item i) {
		m.addItem(i);
		return this;
	}
	
	Meal build() {
		return m;
	}

	
}
