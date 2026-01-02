import java.util.*;

public class FindSumDifferentBase
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
		        if(arr[i].charAt(0) == 'b' || arr[i].charAt(0) == 'B') {
		            sum += fromBinary(arr[i].substring(1));
		        }
		        if(arr[i].charAt(0) == 'o' || arr[i].charAt(0) == 'O') {
		            sum += fromOctal(arr[i].substring(1));
		        }
		        if(arr[i].charAt(0) == 'd' || arr[i].charAt(0) == 'D') {
		            sum += fromDecimal(arr[i].substring(1));
		        }
		        if(arr[i].charAt(0) == 'h' || arr[i].charAt(0) == 'H') {
		            sum += fromHexa(arr[i].substring(1));
		        }
		}
		System.out.println(sum);
	}
	
	public static int fromBinary(String str) {
	    return Integer.parseInt(str, 2);
	}
	
	public static int fromOctal(String str) {
	    return Integer.parseInt(str, 8);
	}
	
	public static int fromDecimal(String str) {
	    return Integer.parseInt(str);
	}
	
	public static int fromHexa(String str) {
	    return Integer.parseInt(str, 16);
	}
}
