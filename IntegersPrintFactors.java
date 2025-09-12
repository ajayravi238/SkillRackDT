import java.util.*;
public class IntegersPrintFactors {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
		    arr[i] = sc.nextInt();
		}
		for(int i=0; i+K<=N; i=i+K) {
		    String fn = "";
		    for(int j=i; j<i+K; j++) {
		        fn += (arr[j]%10) + "";
		    }
		    int y = Integer.parseInt(fn);
		    if(y == 0) {
		        System.out.println(0);
		    }
		    else {
		        System.out.print(1 + " ");
		        for(int z=2; z<=y; z++) {
		            if(y%z == 0) {
		                System.out.print(z + " ");
		            }
		        }
		        System.out.println();
		    }
		}
	}
}
