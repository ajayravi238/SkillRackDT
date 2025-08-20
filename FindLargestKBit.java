import java.util.*;

public class FindLargestKBit
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int K = sc.nextInt();
		ArrayList<String> al = new ArrayList<>();
		for(int i=0; i<=str.length()-K; i++) {
		    al.add(str.substring(i, i+K));
		}
		int[] arr = new int[al.size()];
		int max = Integer.MIN_VALUE;
		for(int i=0; i<al.size(); i++) {
		    arr[i] = Integer.parseInt(al.get(i), 2);
		    if(arr[i] > max) {
		        max = arr[i];
		    }
		}
		System.out.println(max);
	}
}
