package arrays;

import java.util.Arrays;

public class ArrayUtils {
	public static int sum(int[] numbers) {
		int sum = 0;
		for(int i = 0; i< numbers.length; i++){
			sum += numbers[i];
		}
		return sum;
	}


	public static int largest(int[] numbers) {
	Arrays.sort(numbers);
int rawr = numbers[numbers.length-1];

		return rawr;
	}

	public static double average(int[] numbers) {
		double sum = 0;
		for(int i = 0; i< numbers.length; i++){
			sum += numbers[i];
		}
		sum = sum/numbers.length;
		return sum;
	}

	public static int[] reverse(int[] numbers) {
		int [] reverse = new int[numbers.length];
		for(int i = 0; i< numbers.length; i++){
	reverse[i] = numbers[numbers.length-1-i];
		}
		return reverse;
	}

	public static int[] add(int[] a, int[] b) {

		int c = 0;
		if(a.length<b.length) {
			 c = b.length;
		} else {
			 c = a.length;
		}
		int [] added = new int[c];
		for(int i = 0; i<c; i++)
			added[i] = a[i]+b[i];
		return added;
	}
}
