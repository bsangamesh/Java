package cpm.SingleTon;

public class SingleTon {

	public static void main(String[] args) {
		JavaSingleton s1 = JavaSingleton.getInstance();
		JavaSingleton s2 = JavaSingleton.getInstance();
		System.out.println(s1);
		System.out.println(s2);

	}

}
