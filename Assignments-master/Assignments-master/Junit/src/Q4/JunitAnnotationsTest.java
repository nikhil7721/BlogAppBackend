package Q4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JUnitAnnotationsTest {
	JUnitAnnotations Junit;
	@BeforeEach
	void init() {
		Junit=new JUnitAnnotations();
		System.out.println("Before Each Test this @beforeEach is Executed"+Junit);
	}
	@AfterEach
	void clean() {
		System.out.println("After Each is Executed Cleaning up....\n\n");
	}
	@BeforeAll
	static void before1() {
		System.out.println("Before All Annotation");
	}
	void after() {
		System.out.println("\nEnd of Coding.......!");
	}
	/*
	 * public void display() { Junit.add(10,20); }
	 */
	@Test

	void test1() {
		int expected=90;
		int actual=Junit.add(10,80);
		assertEquals(expected, actual);
	}
	@Test
	void test2() {
		int expected=800;
		int actual=Junit.multiply(10,80);
		assertEquals(expected, actual);
	}


}
