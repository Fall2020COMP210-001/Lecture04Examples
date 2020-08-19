package lec04;

public class Example2Tail {

	public static void main(String[] args) {
		
		int[] values = new int[10000000];
		
		int sum = sumArrayFromPos(values, 0, 0);
		
		System.out.println(sum);
	}
	
	public static int sumArrayFromPos(int[] vals, int pos, int sum_so_far) {
		
		if (pos == vals.length-1) {
			return vals[pos] + sum_so_far;
		} else {
			return sumArrayFromPos(vals, pos+1, vals[pos] + sum_so_far);
		}
	}
}
