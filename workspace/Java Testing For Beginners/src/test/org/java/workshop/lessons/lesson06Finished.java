package org.java.workshop.lessons;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import java.awt.Color;

import org.testng.annotations.Test;

public class lesson06Finished {
	public class Plant {
		String name;
		Color color;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Color getColor() {
			return color;
		}

		public void setColor(Color color) {
			this.color = color;
		}
	}

	@Test
	public void okayIHaveACustomBeanObjectWhatCanYouDoForMe() {
		Plant testPlant = new Plant();
		testPlant.setColor(new Color(123456));
		testPlant.setName("Treefoil");

		assertThat(testPlant, allOf(
				hasProperty("name", is(equalTo("Treefoil"))),
				hasProperty("color", is(equalTo(new Color(123456))))
				));
	}

	@Test
	public void canYouNestMoreThanOnce(){
		Plant testPlant = new Plant();
		testPlant.setColor(new Color(123456));
		testPlant.setName("Treefoil");

		assertThat(testPlant, allOf(
				hasProperty("name", is(equalTo("Treefoil"))),
				hasProperty("color", allOf(
						hasProperty("blue", is(equalTo(64))),
						hasProperty("green", is(equalTo(226)))
						))
				));
	}
}
