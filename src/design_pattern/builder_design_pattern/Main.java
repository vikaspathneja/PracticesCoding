package design_pattern.builder_design_pattern;

public class Main {
	public static void main(String[] args) {
		Item solidItem=new Burger();
		MealBuilder mb=new MealBuilder();
		Meal m1 = 
				mb
				.getLiquidMeal(new Colddrink())
				.getLiquidMeal(new Mojito())
				.getLiquidMeal(new Mojito())
				.getLiquidMeal(new Mojito())
				.getLiquidMeal(new Mojito())
				.getLiquidMeal(new Mojito())
				.build();
		System.out.println("liquid meal price="+m1.getMealPrice());
		Meal m2=mb.getSolidMeal(solidItem).build();
		System.out.println(m2.getMealPrice());
		
		System.out.println(mb.build().getMealPrice());
	
	
	
		ComboMealBuilder cmb=new ComboMealBuilder();
		Meal m=cmb.getLiquidMeal(new Colddrink()).getSolidMeal(new Burger()).build();
		System.out.println(m.getMealPrice());
	
	
		StringBuilder sb=new StringBuilder();
		sb.append("public class ");
        sb.append("codebuilder");
        sb.append("\n  {");
        System.out.println(sb.toString());
	}
	
}
