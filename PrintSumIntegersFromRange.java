import java.util.*;
public class PrintSumIntegersFromRange {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[N];
		for(int i=0; i<N; i++) {
		    arr[i] = sc.next();
		}
		long s = 0;
		int start = 0, end = 0;
		for(int i=0; i<N; i++) {
		    start = Character.getNumericValue(arr[i].charAt(0));
		    end = Character.getNumericValue(arr[i].charAt(arr[i].length()-1));
		    String str = "";
		    if(start < end) {
		        for(int a=start; a<=end; a++) {
		            str += a;
		        }
	        }
		    else {
		        for(int b=start; b>=end; b--) {
		            str += b;
		        }
            }
            s += Long.parseLong(str);
		}
		System.out.println(s);
	}
}
