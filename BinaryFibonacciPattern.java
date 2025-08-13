import java.util.*;
public class BinaryFibonacciPattern {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] arr = new String[(2*num)-1];
		String first = "0", second = "1";
		arr[0] = "0";
		arr[1] = "1";
		int k = num-2;
		for(int i=2; i<(2*num)-1; i++) {
		    if(i < num) {
		        arr[i] = first + second;
		        first = second;
		        second = arr[i];
		    }
		    else {
		        arr[i] = arr[k--];
		    }
		}
		for(int i=0; i<(2*num)-1; i++) {
		    System.out.println(arr[i]);
		}
	}
}
