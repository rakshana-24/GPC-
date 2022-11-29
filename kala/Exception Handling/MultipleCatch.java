public class MultipleCatch {
	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			System.out.println(a[10]);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception Occured");
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception Occured");
		}
		
		catch(Exception e) {
			System.out.println("Parent Exception Occured");
		}
		
		System.out.println("rest of the code");
	}
}
