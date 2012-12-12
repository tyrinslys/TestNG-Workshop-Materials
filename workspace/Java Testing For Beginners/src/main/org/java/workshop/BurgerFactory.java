package org.java.workshop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class BurgerFactory {
	private List<Ingredient> recipe;
	private int bottomEssentials = 3;
	private int topEssentials = 1;

	public BurgerFactory(){
		createRecipe();
	}
	private void createRecipe() {
		recipe = new ArrayList<Ingredient>();
		recipe.add(new Ingredient("Bottom Bun"));
		recipe.add(new Ingredient("Hamburger Meat"));
		recipe.add(new Ingredient("American Cheese"));
		recipe.add(new Ingredient("Onion"));
		recipe.add(new Ingredient("Tomato"));
		recipe.add(new Ingredient("Lettuce"));
		recipe.add(new Ingredient("Mayonnaise"));
		recipe.add(new Ingredient("Top Bun"));
	}
	public Burger createBurger(BurgerOrder order) {
		Burger burger = new Burger();
		addBottomEssentials(order, burger);
		addNormalIngredients(order, burger);
		addExtraIngredients(order, burger);
		addTopEssentials(order, burger);
		return burger;
	}
	private void addBottomEssentials(BurgerOrder order, Burger burger) {
		for(int index = 0; index < bottomEssentials; index++){
			addNormalIngredient(order, burger, recipe.get(index));
		}
	}

	private void addNormalIngredient(BurgerOrder order, Burger burger, Ingredient ingredient){
		addIngredient(order, burger, ingredient);
		if(order.needsExtra(ingredient)){
			addIngredient(order, burger, ingredient);
		}
	}
	private void addIngredient(BurgerOrder order, Burger burger, Ingredient ingredient) {
		if(!order.shouldLeaveOut(ingredient)){
			burger.add(ingredient);
		}
	}
	private void addNormalIngredients(BurgerOrder order, Burger burger) {
		for(int index = bottomEssentials; index < (recipe.size()- topEssentials); index++){
			addNormalIngredient(order, burger, recipe.get(index));
		}
	}

	private void addExtraIngredients(BurgerOrder order, Burger burger) {
		Iterator<Ingredient> extrasIterator = order.getExtraIterator();
		while(extrasIterator.hasNext()){
			Ingredient ingredient = extrasIterator.next();
			if(!hasBeenPlaced(ingredient)){
				addIngredient(order, burger, ingredient);
			}
		}
		
	}
	private boolean hasBeenPlaced(Ingredient ingredient) {
		return recipe.indexOf(ingredient) < (recipe.size() - topEssentials);
	}
	private void addTopEssentials(BurgerOrder order, Burger burger) {
		//TODO: deliberately left out to create major bug
		
	}
	public List<Ingredient> getRecipe(){
		return Collections.unmodifiableList(recipe);
	}
}
