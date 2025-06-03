import java.util.*;
public class MergeVideoClip {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[num];
		for(int i=0; i<num; i++) {
		    arr[i] = sc.next();
		}
		int sumMin = 0, sumSec = 0, sumHr = 0;
		List<String> l = new ArrayList<>();
		for(int i=0; i<num; i++) {
		    String[] x = arr[i].split(":");
		    sumMin += Integer.parseInt(x[0]);
		    sumSec += Integer.parseInt(x[1]);
		    if(sumSec >= 60) {
		        sumMin += (sumSec/60);
		        sumSec -= 60;
		    }
		    if(sumMin >= 60) {
		        sumHr += (sumMin/60);
		        sumMin -= 60;
		    }
		    String t1 = String.format("%02d", sumHr);
		    String t2 = String.format("%02d", sumMin);
		    String t3 = String.format("%02d", sumSec);
		  l.add(t1 + ":" + t2 + ":" + t3);
		}
		System.out.println("Total Duration: " + l.get(l.size()-1));
		for(int i=0; i<l.size()-1; i++) {
		    System.out.println(l.get(i));
		}
	}
}
