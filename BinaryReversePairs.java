import java.util.*;
public class BinaryReversePairs {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
		    arr[i] = sc.nextInt();
		}
		String[] binArr = new String[N];
		for(int i=0; i<N; i++) {
		    binArr[i] = Integer.toBinaryString(arr[i]);
		}
		int flag = 0;
		for(int i=0; i<N; i++) {
		    for(int j=i+1; j<N; j++) {
		        StringBuilder rev = new StringBuilder(binArr[j]).reverse();
		        if(binArr[i].equals(rev.toString())) {
		            System.out.println(arr[i] + " " + arr[j]);
		            flag = 1;
		        }
		    }
		}
		if(flag == 0) {
		    System.out.println(-1);
		}
	}
}
