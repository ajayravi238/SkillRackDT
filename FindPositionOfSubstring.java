import java.util.*;
public class FindPositionOfSubstring {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String ss = sc.nextLine();
		int part = str.length()/ss.length();
		String[] arr = new String[part];
		arr[0] = ss;
		for(int i=1; i<str.length()/ss.length(); i++) {
		    arr[i] = sc.nextLine();
		}
		String[] check = new String[part];
		int start = 0, end = ss.length();
		for(int i=0; i<part; i++) {
		    check[i] = str.substring(start, end);
		    start = end;
		    end = end+ss.length();
		}
		for(int i=0; i<arr.length; i++) {
		    for(int j=0; j<check.length; j++) {
		        if(arr[i].equals(check[j])) {
		            System.out.println(j+1);
		        }
		    }
		}
	}
}
