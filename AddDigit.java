import java.util.*;

public class AddDigit
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<num; i++) {
		    arr[i] = sc.nextInt();
		}
		int newNum = sc.nextInt();
		String str = "";
		for(int i=0; i<num; i++) {
		    str += arr[i];
		}
		System.out.println(Integer.parseInt(str)+newNum);
	}
}
