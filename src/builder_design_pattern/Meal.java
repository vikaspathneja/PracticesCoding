package builder_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	List<Item>items=new ArrayList<>();
	
	List<Item> listOfItems(){
		return this.items;
	}
	int getMealPrice(){
		int amount=0;
		for(Item item:this.listOfItems()) {
			amount+=item.getPrice();
		}
		return amount;
	}

	void addItem(Item e){
		this.items.add(e);
	}

}
