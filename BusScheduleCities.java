import java.util.*;
public class BusScheduleCities {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] source = new String[N];
		String[] des = new String[N];
		for(int i=0; i<N; i++) {
		    source[i] = sc.next();
		    des[i] = sc.next();
		}
		String city = sc.next();
		Set<String> ss = new LinkedHashSet<>();
		System.out.print(city + " -> ");
		int desFlag = 0;
		for(int i=0; i<N; i++) {
		    if(city.equals(source[i])) {
		        ss.add(des[i]);
		        desFlag = 1;
		    }
		}
		for(String i : ss) {
		    System.out.print(i + " ");
		}
		if(desFlag == 0) {
		    System.out.print("-1");
		}
		System.out.println();
		Set<String> ds = new LinkedHashSet<>();
		System.out.print(city + " <- ");
		int sourceFlag = 0;
		for(int i=0; i<N; i++) {
		    if(city.equals(des[i])) {
		        ds.add(source[i]);
		        sourceFlag = 1;
		    }
		}
		for(String i : ds) {
		    System.out.print(i + " ");
		}
		if(sourceFlag == 0) {
		    System.out.print("-1");
		}
	}
}
