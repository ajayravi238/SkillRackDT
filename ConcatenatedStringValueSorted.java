import java.util.*;
public class ConcatenatedStringValueSorted {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		ArrayList<String> a = new ArrayList<>();
		for(int i=0; i<str1.length(); i++) {
		    String res = "";
		    res += str1.substring(0, i+1);
		    res += str2.substring(str2.indexOf(str1.charAt(i))+1);
		    a.add(res);
		}
		Collections.sort(a);
		for(String i : a) {
		    System.out.println(i);
		}
	}
}
