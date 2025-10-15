import java.util.*;
public class FindSumExpandedInteger {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[N];
		for(int i=0; i<N; i++) {
		    arr[i] = sc.nextLine();
		}
		int sum = 0;
		for(int i=0; i<N; i++) {
		    String str = "";
		    int num;
		    for(int j=0; j<arr[i].length();) {
		        num = Character.getNumericValue(arr[i].charAt(j));
		        str += arr[i].charAt(j);
		        j = j + num;
		    }
		    sum += Integer.parseInt(str);
		}
		System.out.println(sum);
	}
}
