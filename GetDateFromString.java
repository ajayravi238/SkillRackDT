import java.util.*;

public class GetDateFromString
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split("-");
		String d = "", m = "", y = "";
		for(int i=0; i<arr.length; i++) {
		    if(arr[i].length() == 2) {
		        if(arr[i].charAt(0) != '0') {
		            d += arr[i];
		        }
		        else {
		            d += arr[i].substring(1);
		        }
		    }
		    else if(arr[i].length() == 3) {
		        m += arr[i];
		    }
		    else {
		        y += arr[i];
		    }
		}
		System.out.println(d + " " + m + " " + y);
	}
}
