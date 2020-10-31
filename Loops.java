
public class Loops {

	public static void main(String[] args) {

		int x = 0;
		
		while (x <= 100) {
			System.out.println(x);
			x += 2;
		}
		
		
		x = 100;
		
		while (x >= 0) {
			System.out.println(x);
			x -= 3;
		}
		
		for (int i = 1; i <= 100; i += 2) {
			System.out.println(i);
		}
		
		
		for (int i = 0; i <= 100; i++) {
			
			if (i % 15 == 0) {
				System.out.println("HelloWorld");
			} else if (i % 5 == 0) {
				System.out.println("World");
			} else if (i % 3 == 0) {
				System.out.println("Hello");
			} else {
				System.out.println(i);
			}
			
		}
		
	}
	
}
