import java.util.*;
public class StringBinaryToggleCase {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.nextLine();
		int X = sc.nextInt();
		String bin = Integer.toBinaryString(X);
		String res1 = "";
		String res2 = "";
		for(int i=0; i<bin.length(); i++) {
		    if(bin.charAt(i) == '1') {
		        res1 += Character.toUpperCase(S.charAt(i));
		    }
		    else {
		        res1 += Character.toLowerCase(S.charAt(i));
		    }
		}
		res1 += S.substring(bin.length());
		System.out.println(res1);
		res2 += S.substring(0, S.length() - bin.length());
		int k = 0;
		for(int i=S.length()-bin.length(); i<S.length(); i++) {
		    if(bin.charAt(k++) == '1') {
		        res2 += Character.toUpperCase(S.charAt(i));
		    }
		    else {
		        res2 += Character.toLowerCase(S.charAt(i));
		    }
		}
		System.out.println(res2);
	}
}
