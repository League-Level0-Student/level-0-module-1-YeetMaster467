package _05_for_loops._2_badgers;

public class Badger {
	public static void main(String[] args) {
		
		String b = "Badger, ";
		String m = "Mushroom, ";
		int bTime = 11;
		int mTime = 1;
		int count = 0;
		
		for(count = 0; count <= bTime; count +=1) {
			System.out.print(b);
		}
		System.out.println(" ");
		for(count = 0; count <= mTime; count +=1) {
			System.out.print(m);
		}
		
		System.out.println(" ");
		System.out.println(" ");
		
		for(count = 0; count <= bTime; count +=1) {
			System.out.print(b);
		}
		System.out.println(" ");
		for(count = 0; count <= mTime; count +=1) {
			System.out.print(m);
		}
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("A Snake!!!");
		
	}

}
