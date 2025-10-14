import java.util.*;
public class CheckRangeInString {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		sc.nextLine();
		String S = sc.next();
		String str = "";
		for(int i=X; i<=Y; i++) {
		    str += i;
		}
		if(str.equals(S)) {
		    System.out.println("YES");
		}
		else {
		    System.out.println("NO");
		}
	}
}
