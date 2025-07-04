import java.util.*;

public class StringToBits
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String str = s.toLowerCase();
		for(int i=0; i<str.length(); i++) {
		    int val = (int)str.charAt(i)-96;
		    if(val%2 != 0) {
		        System.out.print("1");
		    }
		    else {
		        System.out.print("0");
		    }
		}
	}
}
