package org.java.workshop.lessons;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class Lesson03Finished {

	@Test(groups = "integration")
	public void itOnlyGetsBetterFromHereWithGroups() {
		passingTest();
	}

	@Test(groups = "unit")
	public void thisIsAnotherGroup() {
		passingTest();
	}

	private void passingTest() {
		assertThat(true, is(true));
	}

	@Test(groups = "unit")
	public void thisTestWillFail() {
		failingTest();
	}

	 @Test(dependsOnGroups = "unit")
//	@Test(dependsOnGroups = { "unit", "integration" })
	public void thisTestWillBeSkipped() {
		// doesn't matter what you put in here. This test is skipped. Because a
		// dependency failed.
	}

	private void failingTest() {
		assertThat(false, is(true));
	}

	@Test(dependsOnMethods = "thisTestWillFail")
	public void thisTestwillAlsoBeSkipped() {
		// other methods can be dependencies.
	}
	// Advanced users lookup how to use data providers :)
}
