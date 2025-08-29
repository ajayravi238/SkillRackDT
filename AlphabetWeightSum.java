import java.util.*;
public class AlphabetWeightSum {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().toLowerCase();
		int[] fib = new int[26];
		fib[0] = 0;
		fib[1] = 1;
		int first = fib[0], second = fib[1];
		for(int i=2; i<26; i++) {
		    fib[i] = first + second;
		    first = second;
		    second = fib[i];
		}
		int sum = 0;
		for(int i=0; i<str.length(); i++) {
		    sum += fib[(int)str.charAt(i)-97];
		}
		System.out.println(sum);
	}
}
