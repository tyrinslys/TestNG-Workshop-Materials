package org.java.workshop;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BurgerFactoryTestStart {
	private BurgerFactory burgerFactory = new BurgerFactory();
	private Map<String, Ingredient> ingredientList = new HashMap<String, Ingredient>();

	@BeforeClass
	public void createIngretientList(){
		addBurgerFactorysIngredients();
		ingredientList.put("Bacon", new Ingredient("Bacon"));
		ingredientList.put("Special Sauce", new Ingredient("Special Sauce"));
	}
	private void addBurgerFactorysIngredients(){
		for(Ingredient ingredient: burgerFactory.getRecipe()){
			ingredientList.put(ingredient.getName(), ingredient);
		}
	}
	@Test
	public void testNoOnions(){
		BurgerOrder noOnionsOrder = new BurgerOrder();
		noOnionsOrder.addWithout(ingredientList.get("Onions"));
		Burger testBurger = burgerFactory.createBurger(noOnionsOrder);
		assertThat(testBurger, hasProperty("stackOfIngredients", not(hasItem(
				hasProperty("name", equalTo("Onions"))
				))));
	}
}
