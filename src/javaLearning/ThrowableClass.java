package javaLearning;

public class ThrowableClass extends Throwable{
	/*
	* Throwable class is the super class of Error and Exception
	* Throwable class is extends to Object class
	* Only objects that are one of the subclasses of this clas are thrown by any JVM or 
	maybe thrown by Java throw statement
	* If you want to create your own customized exception then your class must extend to Throwable class
	
	public constructors of Throwable classes are
	1) Throwable()
	2) Throwbale(String message)
	3) Throwable (String message, Throwable class)
	4) Throwable (Throwable cause)

	Protected constructors
	1. Throwable(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
	
	 */
	
}

	class ThrowAndThrowsExample
	{
		void method() throws ThrowableClass
		{
			ThrowableClass e = new ThrowableClass(); 
			throw e;
		}
	}
