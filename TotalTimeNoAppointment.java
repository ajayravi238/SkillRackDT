import java.util.*;
public class TotalTimeNoAppointment {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[N];
		for(int i=0; i<N; i++) {
		    arr[i] = sc.nextLine();
		}
		ArrayList<String> a = new ArrayList<>();
		for(int i=0; i<N; i++) {
		    String[] time = arr[i].split(" ");
		    a.add(time[0]);
		    a.add(time[1]);
		}
		Collections.sort(a);
		int sum = 0;
		String[] hmf = a.get(0).split(":");
		sum += Integer.parseInt(hmf[0]) * 60;
		sum += Integer.parseInt(hmf[1]);
		
		for(int i=1; i<a.size()-1; i+=2) {
		    String[] hm = a.get(i).split(":");
		    String[] hm1 = a.get(i+1).split(":");
		    int m1 = 0, m2 = 0;
		    m1 += (Integer.parseInt(hm[0]) * 60);
		    m1 += Integer.parseInt(hm[1]);
		    
		    m2 += (Integer.parseInt(hm1[0]) * 60);
		    m2 += Integer.parseInt(hm1[1]);
		    sum += (m2 - m1);
		}
		
		String[] hml = a.get(a.size()-1).split(":");
		int m = Integer.parseInt(hml[0]) * 60;
		m += Integer.parseInt(hml[1]);
		int m2 = 24 * 60;
		sum += (m2 - m);
		System.out.println(sum);
	}
}
