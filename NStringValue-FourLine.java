import java.util.*;
public class NStringValueFourLine {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[num];
		for(int i=0; i<num; i++) {
		    arr[i] = sc.nextLine();
		}
		int sLen = arr[0].length()/4;
		for(int i=0; i<num-1; i+=2) {
		    for(int j=0; j<arr[i].length(); j+=sLen) {
		        System.out.println(arr[i].substring(j, j+sLen) + "" + arr[i+1].substring(j, j+sLen));
		    }
		}
	}
}
