import java.util.*;
public class FindMissingNumberSortInteger {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] arr = new String[N];
		for(int i=0; i<N; i++) {
		    arr[i] = sc.next();
		}
		long[] res = new long[N];
		for(int i=0; i<N; i++) {
		    int first = Character.getNumericValue(arr[i].charAt(0));
		    int last = Character.getNumericValue(arr[i].charAt(arr[i].length()-1));
		    String str = "";
		    if(first > last) {
		        for(int j=first; j>=last; j--) {
		            str += j;
		        }
		    }
		    else if(last > first) {
		        for(int j=first; j<=last; j++) {
		            str += j;
		        }
		    }
		    res[i] = Long.parseLong(str);
		}
		Arrays.sort(res);
		for(Long i : res) {
		    System.out.print(i + " ");
		}
	}
}
