package lec04;

public class Example1 {

	public static void main(String[] args) {
		
		int[] values = {1, 7, 4, 9};
		
		int sum = 0;
		
		for (int i=0; i<values.length; i++) {
			sum += values[i];
		}
		
		System.out.println(sum);
	}
}
