package String;

class CompareStr {
	public static void main(String[] args) {
		
		String first = "java programming";
		String second = "java programming";
		String third = "python programming";
		
		boolean result1 = first.equals(second);
		System.out.println("String first and second are equal:" + result1);
		
		boolean result2 = first.equals(third);
		System.out.println("String first and third are equal: " +result2);
	}
}
