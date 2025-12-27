import java.util.*;

public class MaxIntegerRemoveDigitD
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		char D = sc.next().charAt(0);
		int max = Integer.MIN_VALUE;
		for(int i=0; i<N.length(); i++) {
		    if(N.charAt(i) == D) {
		        String str = N.substring(0, i) + "" + N.substring(i+1);
		        if(max < Integer.parseInt(str)) {
		            max = Integer.parseInt(str);
		        }
		    }
		}
		System.out.println(max);
	}
}
