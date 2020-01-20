package lec05;

public class Lec05Example2 {

	public static void main(String[] args) {
		
		int[] values = {1, 7, 4, 9};
		
		int sum = sumArrayFromPos(values, 0);
		
		System.out.println(sum);
	}
	
	public static int sumArrayFromPos(int[] vals, int pos) {
		
		if (pos == vals.length-1) {
			return vals[pos];
		} else {
			return vals[pos] + sumArrayFromPos(vals, pos+1);
		}
	}
}
