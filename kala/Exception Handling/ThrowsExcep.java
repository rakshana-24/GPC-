public class ThrowsExcep {
	static void fun() throws IllegalAccessException {
		System.out.println("Inside fun(). ");
		throw new IllegalAccessException("demo");
	}
	
	public static void mina(String[] args) {
		try {
			fun();
		}
		
		catch(IllegalAccessException e) {
			System.out.println("caught in main");
		}
	}
}
