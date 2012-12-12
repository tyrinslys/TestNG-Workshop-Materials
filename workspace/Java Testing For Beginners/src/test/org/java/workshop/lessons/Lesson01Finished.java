package org.java.workshop.lessons;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Lesson01Finished {

	// TODO: use to keep screen clean @Test(enabled=false)
	/**
	 * Step one cover basic test requirements. Let them know what the bear
	 * minimum is.
	 */
	@Test
	public void soHowDoICreateATest() {
		// Really this is all you need!
	}

	@Test
	public void wellNo_YouShouldProbablyActuallyWriteATest() {
		String expectedString = "This is my 1 true expected string.";
		StringBuilder testStringBuilder = new StringBuilder();
		testStringBuilder.append("This");
		testStringBuilder.append(' ');
		testStringBuilder.append("is my ");
		testStringBuilder.append(1);
		testStringBuilder.append(' ');
		testStringBuilder.append(true);
		char[] lastPart = new char[] { ' ', 'e', 'x', 'p', 'e', 'c', 't', 'e', 'd', ' ', 's', 't', 'r', 'i', 'n', 'g', '.' };
		testStringBuilder.append(lastPart);

		String testString = testStringBuilder.toString();
		Assert.assertEquals(testString, expectedString);
	}

	@Test
	public void thatIsGreat_itPassed_butWhatIfItFails() {
		String expectedString = "This String is the expected String.";
		String testString = "This String is the test String.";
		Assert.assertEquals(testString, expectedString);
		// explain import static ... so we don't have to keep typing
		// Assert.assert... that is annoying.
	}

	/**
	 * Enter Hamcrest
	 */
	@Test
	public void okayThatIsGreat_butWeCanDoBetter() {
		String expectedString = "This String is the expected String.";
		String testString = "This String is the test String.";
		assertThat(testString, equalTo(expectedString));
		// The static method 'assertThat' is in the MatcherAssert class of Hamcrest.
		// The static method 'equalTo' is in the Matchers static class of Hamcrest.
	}

	@Test
	public void andDontForgetTheCandy() {
		String expectedString = "Okay we need someting that is the same.";
		String testString = "Okay we need someting that is the same.";
		assertThat(testString, equalTo(expectedString));
		assertThat(testString, is(expectedString));
		assertThat(testString, is(equalTo(expectedString)));
		// These are all functionally equivalent. Readability is key!
	}
}
