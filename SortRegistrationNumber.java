import java.util.*;
public class SortRegistrationNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextLine();
		}
		int[] year = new int[N];
		String[] dept = new String[N];
		int[] rollNo = new int[N];
		for(int i=0; i<N; i++) {
			year[i] = Integer.parseInt(arr[i].charAt(0) + "" + arr[i].charAt(1));
			dept[i] = arr[i].charAt(2) + "" + arr[i].charAt(3);
			rollNo[i] = Integer.parseInt(arr[i].charAt(4) + "" + arr[i].charAt(5) + "" + arr[i].charAt(6));
		}
		for(int i=0; i<N; i++) {
			for(int j=0; j<N-1; j++) {
				if(year[j] < year[j+1]) {
					int temp = year[j];
					String t = dept[j];
					int te = rollNo[j];
					year[j] = year[j+1];
					dept[j] = dept[j+1];
					rollNo[j] = rollNo[j+1];
					year[j+1] = temp;
					dept[j+1] = t;
					rollNo[j+1] = te;
				}
				if(year[j] == year[j+1]) {
					if(dept[j].charAt(0) != 'E') {
						if(dept[j].charAt(0) > dept[j+1].charAt(0)) {
							int temp = year[j];
							String t = dept[j];
							int te = rollNo[j];
							year[j] = year[j+1];
							dept[j] = dept[j+1];
							rollNo[j] = rollNo[j+1];
							year[j+1] = temp;
							dept[j+1] = t;
							rollNo[j+1] = te;
						}
						if(dept[j].charAt(0) == dept[j+1].charAt(0)) {
							if(rollNo[j] > rollNo[j+1]) {
								int temp = year[j];
								String t = dept[j];
								int te = rollNo[j];
								year[j] = year[j+1];
								dept[j] = dept[j+1];
								rollNo[j] = rollNo[j+1];
								year[j+1] = temp;
								dept[j+1] = t;
								rollNo[j+1] = te;
							}
						}
					}
					else {
						if(dept[j].charAt(1) > dept[j+1].charAt(1)) {
							int temp = year[j];
							String t = dept[j];
							int te = rollNo[j];
							year[j] = year[j+1];
							dept[j] = dept[j+1];
							rollNo[j] = rollNo[j+1];
							year[j+1] = temp;
							dept[j+1] = t;
							rollNo[j+1] = te;
						}
						if(dept[j].charAt(1) == dept[j+1].charAt(1)) {
							if(rollNo[j] > rollNo[j+1]) {
								int temp = year[j];
								String t = dept[j];
								int te = rollNo[j];
								year[j] = year[j+1];
								dept[j] = dept[j+1];
								rollNo[j] = rollNo[j+1];
								year[j+1] = temp;
								dept[j+1] = t;
								rollNo[j+1] = te;
							}
						}
					}
				}
			}
		}
		for(int i=0; i<N; i++) {
			System.out.println(year[i] + "" + dept[i] +"" + String.format("%03d", rollNo[i]));
		}
	}
}
