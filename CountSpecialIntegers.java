import java.util.*;
public class CountSpecialIntegers
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = 0;
		for(int i=l; i<=r; i++) {
		    if((i%a == 0) && (i%b == 0) && ((String.valueOf(i).contains(String.valueOf(a)) && (String.valueOf(i).contains(String.valueOf(b)))))) {
		        count++;
		    }
		}
		System.out.println(count);
	}
}
