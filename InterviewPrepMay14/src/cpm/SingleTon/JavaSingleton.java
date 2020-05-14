package cpm.SingleTon;

public class JavaSingleton {

	/*
	 * private static volatile JavaSingleton uniqueInstance;
	 * 
	 * private JavaSingleton(){}
	 * 
	 * public static JavaSingleton getInstance() { if (uniqueInstance == null) {
	 * synchronized (JavaSingleton.class) { if (uniqueInstance == null) {
	 * uniqueInstance = new JavaSingleton(); } } } return uniqueInstance; }
	 */

	private static JavaSingleton uniqueInstance;

	private JavaSingleton(){}

	public static synchronized JavaSingleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new JavaSingleton();
		}
		return uniqueInstance;
	}
}
