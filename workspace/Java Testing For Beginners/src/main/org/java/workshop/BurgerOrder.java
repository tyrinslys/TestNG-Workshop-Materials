package org.java.workshop;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BurgerOrder {
	private Set<Ingredient> extras = new HashSet<Ingredient>();
	private Set<Ingredient> withouts = new HashSet<Ingredient>();

	public void addExtra(Ingredient ingredient) {
		extras.add(ingredient);
		if (withouts.contains(ingredient)) {
			withouts.remove(ingredient);
		}
	}

	public void addWithout(Ingredient ingredient) {
		withouts.add(ingredient);
		if (extras.contains(ingredient)) {
			extras.remove(ingredient);
		}
	}

	public void clearOrder() {
		extras.clear();
		withouts.clear();
	}

	public boolean needsExtra(Ingredient ingredient) {
		return extras.contains(ingredient);
	}

	public Iterator<Ingredient> getExtraIterator() {
		return Collections.unmodifiableSet(extras).iterator();
	}

	public boolean shouldLeaveOut(Ingredient ingredient) {
		return withouts.contains(ingredient);
	}

	public Iterator<Ingredient> getWithoutIterator() {
		return Collections.unmodifiableSet(withouts).iterator();
	}
}