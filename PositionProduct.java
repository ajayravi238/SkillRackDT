import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<num; i++) {
		    arr[i] = sc.nextInt();
		}
		int mul = 1;
		for(int i=0; i<num; i++) {
		    if(arr[i] > 0) {
		        mul = arr[i] * arr[arr[i]-1];
		    }
		    else {
		        mul = arr[i] * arr[num-(Math.abs(arr[i]))];
		    }
		    System.out.print(mul + " ");
		}
	}
}
