package DesignPattern_builder;

public class Main {
	public static void main(String[] args) {
		Meal m = MealBuilder.getLiquidMeal();
		System.out.println(m.getMealPrice());
		Meal m2 = MealBuilder.getSolidMeal();
		System.out.println(m2.getMealPrice());
	}
}