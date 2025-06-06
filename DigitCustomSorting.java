import java.util.*;
public class DigitCustomSorting {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S1 = sc.nextLine();
		String S2 = sc.nextLine();
		for(int i=0; i<S2.length(); i++) {
		    for(int j=0; j<S1.length(); j++) {
		        if(S2.charAt(i) == S1.charAt(j)) {
		            System.out.print(S1.charAt(j));
		        }
		    }
		}
	}
}
