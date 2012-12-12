package org.java.workshop.lessons;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import java.util.Random;

import org.testng.annotations.Test;

public class Lesson04Finished {

	@Test(invocationCount = 100)
	public void okayBackToHamcrest_equalsIsTooEasy() {
		Random random = new Random();
		int randomBetween0And99 = random.nextInt(100);
		assertThat(randomBetween0And99, is(lessThan(100)));
	}

	@Test
	public void whatElseCanWeTestFor() {
		assertThat(40, is(greaterThanOrEqualTo(40)));
	}

	@Test
	public void ArraysAreNotOffLimits() {
		String[] testStringArray = new String[] { "First", "Second word", "3rd" };
		String[] expectedStringArray = new String[] { "First", "Second word", "3rd" };

		assertThat(testStringArray, arrayContaining(expectedStringArray));
	}

	@Test
	public void moreFunWithStrings() {
		assertThat("What the heck, you can do that?",
				allOf(containsString("can do"), startsWith("What"), endsWith("that?")));
	}

	@Test(invocationCount = 1000)
	public void funWithWildCards() {
		Random random = new Random();
		int randomInt = random.nextInt();
		assertThat(randomInt, anyOf(lessThan(0), is(equalTo(0)), greaterThan(0)));
		// I pretty much covered everything right?
	}
}
