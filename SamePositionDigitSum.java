import java.util.*;

public class SamePositionDigitSum
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num1 = sc.next(); // 1234
		String num2 = sc.next(); // 81
		int small = 0;
		String a = "", b = "";
		if(num1.length() < num2.length()) {
		    small = num1.length();
		    b = num2.substring(num2.length()-small);
		    a = num1;
		    System.out.print(num2.substring(0, num2.length()-small));
		}
		else if(num1.length() > num2.length()) {
		    small = num2.length();
		    a = num1.substring(num1.length()-small);
		    b = num2;
		    System.out.print(num1.substring(0, num1.length()-small));
		}
		else {
		    a = num1;
		    b = num2;
		}
		for(int i=0; i<a.length(); i++) {
		    System.out.print(Character.getNumericValue(a.charAt(i)) + Character.getNumericValue(b.charAt(i)));
		}
	}
}
