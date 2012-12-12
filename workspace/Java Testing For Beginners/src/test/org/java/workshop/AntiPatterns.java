package org.java.workshop;

public class AntiPatterns {

	/**
	 * Testing after coding is good verification that what you wrote works in
	 * the small test you performed at the moment you tested it. Writing a test
	 * will last as long as the object you wrote it for and let you know the
	 * moment you broke you application (assuming you run them).
	 */
	public void whyDoINeedTestsSinceITestManuallyAfterCoding() {

	}

	/**
	 * The problem with this is that it slows down the program and is too
	 * inflexible to work long term. Logging messages is good for debugging but
	 * not adequate for tests. If you want to log something then use a logger
	 * not the console.
	 */
	public void iHaveBeenUsingConsoleOutputForTestingThatIsGoodEnough() {
		@SuppressWarnings("unused")
		class DomainObject {
			void doSomething() {
				System.out.println("Test that DomainObject is doing something and print result.");
			}
		}
	}
}
