package lec04;

public class Example2Large {

	public static void main(String[] args) {
		
		int[] values = new int[10000000];
		
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
