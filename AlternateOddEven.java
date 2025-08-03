import java.util.*;

public class AlternateOddEven
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<num; i++) {
		    arr[i] = sc.nextInt();
		}
		List<Integer> odd = new ArrayList<>();
		List<Integer> even = new ArrayList<>();
		for(int i=0; i<num; i++) {
		    if(arr[i]%2 == 0) {
		        even.add(arr[i]);
		    }
		    else {
		        odd.add(arr[i]);
		    }
		}
		for(int i=0; i<odd.size(); i++) {
		    System.out.print(odd.get(i) + " ");
		    System.out.print(even.get(i) +  " ");
		}
	}
}
