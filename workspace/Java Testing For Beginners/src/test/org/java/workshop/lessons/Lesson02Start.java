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
@SuppressWarnings("unused")
public class Lesson02Start {
	private static Queue<String> checkSteps = new LinkedList<String>();
	{
		checkSteps.add("@BeforeClass");
		addMethodStrings();
		checkSteps.add("@AfterClass");
	}
	private static void addMethodStrings(){
		checkSteps.add("@BeforeMethod");
		checkSteps.add("In Method");
		checkSteps.add("@AfterMethod");
	}
}
