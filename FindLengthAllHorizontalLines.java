import java.util.*;
public class FindLengthAllHorizontalLines {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] x = new int[num];
		int[] y = new int[num];
		for(int i=0; i<num; i++) {
		    x[i] = sc.nextInt();
		    y[i] = sc.nextInt();
		}
		ArrayList<Integer> l = new ArrayList<>();
		for(int i=0; i<num; i++) {
		    for(int j=i+1; j<num; j++) {
		        if(y[i] == y[j]) {
		            l.add(Math.abs(x[i]-x[j]));
		        }
		    }
		}
		if(l.size() == 0) {
		    System.out.println(-1);
		    return;
		}
		Collections.sort(l);
		for(int i=0; i<l.size(); i++) {
		    System.out.print(l.get(i) + " ");
		}
	}
}
