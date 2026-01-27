import java.util.*;
public class PrintRangesFromArray {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
		    arr[i] = sc.nextInt();
		}
		Set<Integer> s = new HashSet<>();
		for(int i=0; i<N; i++) {
		    s.add(arr[i]);
		}
		List<Integer> l = new ArrayList<>(s);
		Collections.sort(l);
        int st = l.get(0);
		for(int i=0; i<l.size(); i++) {
		    if(i == l.size()-1 || (l.get(i))+1 != l.get(i+1)) {
		        int e = l.get(i);
		        System.out.print(st + "-" + e + " ");
		        if(i != l.size()-1) {
		            st = l.get(i+1);
		        }
		    }
		}
	}
}
