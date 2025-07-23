import java.util.*;
public class FindTotalRaceTime {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[num];
		int sumSec = 0;
		for(int i=0; i<num; i++) {
		    arr[i] = sc.nextLine();
		    sumSec += Integer.parseInt(arr[i], 2);
		}
		int hr = sumSec / 3600;
		int min = (sumSec % 3600) / 60;
		int sec = sumSec % 60;
		System.out.printf("%02d:%02d:%02d", hr, min, sec);
	}
}
