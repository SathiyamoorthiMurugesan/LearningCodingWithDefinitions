package javaLearning;

public class TestClass {

	public void commonMethod1() {
		System.out.println("I am common method 1 from TestClass");
	}

	public void testMethod() {
		System.out.println("I am test method from Parent class");
	}

}

class childClass extends TestClass {

	public void commonMethod1() {
		System.out.println("I am common method 1 from child class");
	}

	public void childMethod() {
		System.out.println("I am child method from child class");
	}

	public void tesing() {
		childClass obj3 = new childClass();
		super.testMethod(); //prints line 10
	}
}
