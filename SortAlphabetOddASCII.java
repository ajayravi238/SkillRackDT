import java.util.*;
public class SortAlphabetOddASCII {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		List<Character> odd = new ArrayList<>();
		for(int i=0; i<S.length(); i++) {
		    if(((int) S.charAt(i))%2 != 0) {
		        odd.add(S.charAt(i));
		    }
		}
		Collections.sort(odd);
		int k = 0;
		for(int i=0; i<S.length(); i++) {
		    if((int) S.charAt(i)%2 != 0) {
		        System.out.print(odd.get(k++));
		    } else {
		        System.out.print(S.charAt(i));
		    }
		}
	}
}
