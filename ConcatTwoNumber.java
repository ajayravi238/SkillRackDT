import java.util.*;

public class ConcatTwoNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long[] arr = new long[num];
		for(int i=0; i<num; i++) {
		    arr[i] = sc.nextLong();
		}
		for(int i=0; i<num-1; i+=2) {
		    String res = arr[i] + "" + arr[i+1];
		    System.out.print(res + " ");
		}
	}
}
