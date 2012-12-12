package org.java.workshop;

public class Ingredient {

	private String name;

	public Ingredient(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	@Override
	public boolean equals(Object obj) {
		return name.equals(obj);
	}
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	@Override
	public String toString() {
		return name;
	}
}
