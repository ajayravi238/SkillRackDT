import java.util.*;
public class MaximumSumRemoveSameDigit {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[N];
		for(int i=0; i<N; i++) {
		    arr[i] = sc.next();
		}
		long x = 0;
		for(int i=0; i<N; i++) {
		    x += Long.parseLong(arr[i]);
		}
		Long max = Long.MIN_VALUE;
		for(char z='0'; z<='9'; z++) {
		    long sum = 0;
		    for(int i=0; i<N; i++) {
		        StringBuilder sb = new StringBuilder();
		        for(int j=0; j<arr[i].length(); j++) {
		            if(arr[i].charAt(j) != z) {
		                sb.append(arr[i].charAt(j));
		            }
		        }
		        sum += Long.parseLong(sb.toString());
		    }
		    if(sum != x && sum > max) {
		        max = sum;
		    }
		}
		System.out.println(max);
	}
}
