import java.util.*;

public class ConcatAndConvertToOctal
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
		    arr[i] = sc.nextInt();
		}
		String bin = "";
		for(int i=0; i<N; i++) {
		    bin += Long.toBinaryString(arr[i]);
		}
		System.out.println(Long.toOctalString(Long.parseLong(bin, 2)));
	}
}
