package org.java.workshop;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.*;

import org.testng.annotations.Test;

/**
 * <h1>Project setup</h1><br>
 * Note: complete when:
 * <ol>
 * <li>running 'javac -version' yields correct output</li>
 * <li>workspace yields no errors</li>
 * <li>eclipse can run the set up test file (this file).</li>
 * </ol>
 */
public class SetupTest {
	@Test
	public void youWouldntBeAbleToRunThisWithOutTheTestNgJarInYourClassPath() {
		assertTrue(true);
	}

	@Test
	public void thisTestsHamcrest() {
		String test = "Hamcrest is working.";
		assertThat(test, is(equalTo(test)));
	}
}
