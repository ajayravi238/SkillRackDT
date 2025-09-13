import java.util.*;
public class PairsWithSameDigit {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[N];
		for(int i=0; i<N; i++) {
		    arr[i] = sc.next();
		}
		String[] com = new String[N];
		for(int i=0; i<N; i++) {
		    Set<Character> s = new TreeSet<>();
		    for(int j=0; j<arr[i].length(); j++) {
		        s.add(arr[i].charAt(j));
		    }
		    String newStr = "";
		    for(Character j : s) {
		        newStr += j;
		    }
		    com[i] = newStr;
		}
		int flag = 0;
		for(int i=0; i<N-1; i++) {
		    for(int j=i+1; j<N; j++) {
		        if(com[i].equals(com[j])) {
		            System.out.println(arr[i] + " " + arr[j]);
		            flag = 1;
		        }
		    }
		}
		if(flag == 0) {
		    System.out.println(-1);
		}
	}
}
