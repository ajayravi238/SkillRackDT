import java.util.*;

public class SplitOddOrEven
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] arr = new String[N];
		for(int i=0; i<N; i++) {
		    arr[i] = sc.next();
		}
		ArrayList<Long> al = new ArrayList<>();
		for(int i=0; i<N; i++) {
		    String fh = arr[i].substring(0, arr[i].length()/2);
		    String sh = arr[i].substring(arr[i].length()/2);
		    long a = Long.parseLong(fh);
		    long b = Long.parseLong(sh);
		    if((a%2 == 0) && (b%2 == 0)) {
		        al.add(a);
		        al.add(b);
		    }
		    else if((a%2 != 0) && (b%2 != 0)) {
		        al.add(a);
		        al.add(b);
		    }
		    else {
		        al.add(Long.parseLong(arr[i]));
		    }
		}
		Collections.sort(al);
		for(long i : al) {
		    System.out.print(i + " ");
		}
	}
}
