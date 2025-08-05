import java.util.*;
public class FlipCoinHeadAndTail {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<num; i++) {
		    arr[i] = sc.nextInt();
		}
		char ch = sc.next().charAt(0);
		int hCount = 0, tCount = 0;
		for(int i=0; i<num; i++) {
		    if(arr[i]%2 != 0) {
		        if(ch == 'H') {
		            ch = 'T';
		            tCount++;
		        }
		        else {
		            ch = 'H';
		            hCount++;
		        }
		    }
		    else {
		        if(ch == 'H') {
		            hCount++;
		        }
		        else {
		            tCount++;
		        }
		    }
		}
		System.out.println(hCount + " " + tCount);
	}
}
