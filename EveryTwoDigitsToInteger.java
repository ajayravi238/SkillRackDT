import java.util.*;

public class EveryTwoDigitsToInteger
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] chArr = str.toCharArray();
		int[] arr = new int[chArr.length];
		for(int i=0; i<chArr.length; i++) {
		    arr[i] = Character.getNumericValue(chArr[i]);
		}
		long sum = 0;
		for(int i=0; i<arr.length-1; i++) {
		    String val = "";
		    if(arr[i] < arr[i+1]) {
		        for(int j=arr[i]; j<=arr[i+1]; j++) {
		            val += j;
		        }
		        sum += Long.parseLong(val);
		    }
		    else {
		        for(int j=arr[i]; j>=arr[i+1]; j--) {
		            val += j;
		        }
		        sum += Long.parseLong(val);
		    }
		}
		System.out.println(sum);
	}
}
