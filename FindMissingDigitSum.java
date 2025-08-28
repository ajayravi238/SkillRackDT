import java.util.*;
public class FindMissingDigitSum {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[num];
		for(int i=0; i<num; i++) {
		    arr[i] = sc.next();
		}
		int total = sc.nextInt();
		int sum = 0;
		for(int i=0; i<num; i++) {
		    if(!(arr[i].contains("*"))) {
		        sum += Integer.parseInt(arr[i]);
		    }
		}
		int x = total - sum;
		for(int i=0; i<num; i++) {
		    if(!(arr[i].contains("*"))) {
		        System.out.print(arr[i] + " ");
		    }
		    else {
		        System.out.print(x + " ");
		    }
		}
		System.out.println();
	}
}
