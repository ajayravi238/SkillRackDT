import java.util.*;
public class MinimumMaximumInSubArrays {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
		    arr[i] = sc.nextInt();
		}
		int res = Integer.MAX_VALUE;
		for(int i=0; i<=N-K; i++) {
		    int max = Integer.MIN_VALUE;
		    for(int j=i; j<i+K; j++) {
		        if(max < arr[j]) {
		            max = arr[j];
		        }
		    }
		    res = Math.min(max, res);
		}
		System.out.println(res);
	}
}
