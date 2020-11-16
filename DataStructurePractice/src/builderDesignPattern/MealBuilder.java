package builderDesignPattern;

public class MealBuilder {
	static Meal getLiquidMeal() {
		Item item = new Colddrink();
		Meal m = new Meal();
		m.addItem(item);
		return m;
	}

	static Meal getSolidMeal() {
		Item item = new Burger();
		Meal m = new Meal();
		m.addItem(item);
		return m;
	}

	
}
