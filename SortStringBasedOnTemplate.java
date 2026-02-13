import java.util.*;
public class SortStringBasedOnTemplate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S1 = sc.next();
		String S2 = sc.next();
		String res = "";
		List<Character> bal = new ArrayList<>();
		for(int i=0; i<S2.length(); i++) {
			for(int j=0; j<S1.length(); j++) {
				if(S2.charAt(i) == S1.charAt(j)) {
					res += S2.charAt(i);
				}
			}
		}
		for(int i=0; i<S1.length(); i++) {
			int count = 0;
			for(int j=0; j<S2.length(); j++) {
				if(S1.charAt(i) != S2.charAt(j)) {
					count++;
				}
			}
			if(count == S2.length()) {
				bal.add(S1.charAt(i));
			}
		}
		Collections.sort(bal);
		for(int i=0; i<bal.size(); i++) {
			res += bal.get(i);
		}
		System.out.println(res);
	}
}
