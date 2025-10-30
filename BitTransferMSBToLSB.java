import java.util.*;
public class BitTransferMSBToLSB {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
		    arr[i] = sc.nextInt();
		}
		for(int i=0; i<N; i++) {
		    String a = Integer.toBinaryString(arr[i]);
		    StringBuilder sb = new StringBuilder(a);
		    sb.append(a.charAt(0));
		    sb.deleteCharAt(0);
		    System.out.print(Integer.parseInt(sb.toString(), 2) + " ");
		}
	}
}
