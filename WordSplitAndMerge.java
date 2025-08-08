import java.util.*;
public class WordSplitAndMerge {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int num = sc.nextInt();
		String[] arr = str.split(" ");
		StringBuilder first = new StringBuilder();
		String second = "";
		if(arr[num-1].length()%2 == 0) {
		    first.append(arr[num-1].substring(0, arr[num-1].length()/2));
		    second += arr[num-1].substring(arr[num-1].length()/2);
		}
		else {
		    first.append(arr[num-1].substring(0, (arr[num-1].length()/2)+1));
		    second += arr[num-1].substring(arr[num-1].length()/2);
		}
		for(int i=0; i<arr.length; i++) {
		    if(i == num-1) {
		        System.out.print(second + first.reverse() + " ");
		    }
		    else {
		        System.out.print(arr[i] + " ");
		    }
		}
	}
}
