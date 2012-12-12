package org.java.workshop;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class Burger {

	private List<Ingredient> stackOfIngredients = new LinkedList<Ingredient>();

	/**
	 * The order is considered to be bottom item first
	 * 
	 * @param ingredient
	 */
	public void add(Ingredient ingredient) {
		if (ingredient == null) {
			return;
		}
		stackOfIngredients.add(ingredient);
	}

	@Override // for Debugging only... no asserts on this function
	public String toString() {
		StringBuilder asciiBurger = new StringBuilder();
		ListIterator<Ingredient> burgerIngredientIterator = stackOfIngredients.listIterator(stackOfIngredients.size());
		while (burgerIngredientIterator.hasPrevious()) {
			asciiBurger.append(burgerIngredientIterator.previous().getName());
			asciiBurger.append('\n');
		}
		return asciiBurger.toString();
	}

	public List<Ingredient> getStackOfIngredients() {
		return stackOfIngredients;
	}
}