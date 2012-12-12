package org.java.workshop.lessons;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Lesson05Finished {
	private Collection<String> testCollection = new ArrayList<String>();

	@BeforeClass
	public void setupCollection() {
		testCollection.add("one");
		testCollection.add("two");
		testCollection.add("three");
		testCollection.add("four");
		testCollection.add("five");
		testCollection.add("six");
	}

	@Test
	public void funWithCollections() {
		// must be in order
		assertThat(testCollection, contains("one", "two", "three", "four", "five", "six"));
		// can be in any order
		assertThat(testCollection, containsInAnyOrder("five", "one", "three", "four", "six", "two"));
	}

	@Test
	public void butMyCollectionIsHugeAndIOnlyCareThatAFewValuesAreInIt() {
		assertThat(testCollection, allOf(hasItem("one"), hasItem("six")));
	}

	private static Map<String, Integer> testMap = new HashMap<String, Integer>();
	{
		testMap.put("one", 1);
		testMap.put("two", 2);
		testMap.put("three", 3);
	}
	@Test
	public void canWeTestMapsAsWell() {
		assertThat(testMap, hasEntry("one", 1));
		
	}
}
