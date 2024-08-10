
public class Demo5 {
//	static void firstName() {
//		String f = null;
//	}
//	static void lastName() {
//		String l = null;
//	}
	static String fullName(String f, String l) {
		return f + l;
	}

	public static void main(String[] args) {
		
//		String f = (firstName());
//		String l = (lastName());
		String x = fullName("$Rahul", "Dravid$");
		System.out.println(x);
		
	}

}
