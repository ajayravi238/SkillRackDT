import java.util.*;

public class RemoveEvenPosition
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		ArrayList<Integer> res = new ArrayList<>();
		for(int i=0; i<num; i++) {
		    arr[i] = sc.nextInt();
		    if(i%2==0) {
		        res.add(arr[i]);
		    }
		}
		System.out.println(res);
	}
}
