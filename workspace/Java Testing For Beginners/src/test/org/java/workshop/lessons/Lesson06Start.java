package org.java.workshop.lessons;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import java.awt.Color;

import org.testng.annotations.Test;

@SuppressWarnings("unused")
public class Lesson06Start {
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

}
