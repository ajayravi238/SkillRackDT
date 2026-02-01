import java.util.*;
public class ConsecutiveWordBegginingOrEnd {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		int count = 0;
		for(int i=0; i<arr.length-1; i++) {
		    if(arr[i+1].contains(arr[i])) {
		        count++;
		    }
		}
		if(count == arr.length-1) {
		    System.out.println("YES");
		} else {
		    System.out.println("NO");
		}
	}
}
