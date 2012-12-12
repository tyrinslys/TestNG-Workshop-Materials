package org.java.workshop.lessons;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import java.util.LinkedList;
import java.util.Queue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * I don't have a simple string to test. My application is complicated.
 */
public class Lesson02Finished {
	private static Queue<String> checkSteps = new LinkedList<String>();
	{
		checkSteps.add("@BeforeClass");
		addMethodStrings();
		addMethodStrings();
		addMethodStrings();
		checkSteps.add("@AfterClass");
	}
	private static void addMethodStrings(){
		checkSteps.add("@BeforeMethod");
		checkSteps.add("In Method");
		checkSteps.add("@AfterMethod");
	}
	@BeforeClass
	public void thisWillRunBeforeAnyTestMethodInThisClass(){
		String expected = "@BeforeClass";
		String testString = checkSteps.poll();
		assertThat(testString, is(equalTo(expected)));
	}
	@AfterClass
	public void thisWillRunAfterAllOfTheMethodsInThisClass(){
		String expected = "@AfterClass";
		String testString = checkSteps.poll();
		assertThat(testString, is(equalTo(expected)));
		assertThat(checkSteps, is(empty()));
	}
	@BeforeMethod
	public void thisWillRunBeforeEachMethodInThisClass(){
		String expected = "@BeforeMethod";
		String testString = checkSteps.poll();
		assertThat(testString, is(equalTo(expected)));
	}
	@AfterMethod
	public void thisWillRunAfterEachMethodInThisClass(){
		String expected = "@AfterMethod";
		String testString = checkSteps.poll();
		assertThat(testString, is(equalTo(expected)));
	}
	
	@Test
	public void needsMoreSetup() {
		String expected = "In Method";
		String testString = checkSteps.poll();
		assertThat(testString, is(equalTo(expected)));
	}
	@Test
	public void okayCanIRunATestBeforeEachMethod(){
		String expected = "In Method";
		String testString = checkSteps.poll();
		assertThat(testString, is(equalTo(expected)));
	}
	@Test
	public void whatIfABeforeOrAfterFails(){
		String expected = "In Method";
		// comment out the poll to find out
		String testString = checkSteps.poll();
		assertThat(testString, is(equalTo(expected)));
	}

	/* Full list of before and after places
	 * @BeforeSuite
	 * @AfterSuite
	 * @BeforeTest
	 * @AfterTest
	 * @BeforeGroups
	 * @AfterGroups
	 * @BeforeClass
	 * @AfterClass
	 * @BeforeMethod
	 * @AfterMethod
	 */
}
