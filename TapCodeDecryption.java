import java.util.*;
public class TapCodeDecryption {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[][] strArr = new String[5][5];
		for(int i=0; i<5; i++) {
		    for(int j=0; j<5; j++) {
		        strArr[i][j] = sc.next();
		    }
		}
		String[] arr = str.split(" ");
		String res = "";
		for(int i=0; i<arr.length-1; i+=2) {
		    int fir = arr[i].length();
		    int sec = arr[i+1].length();
		    res += strArr[fir-1][sec-1].charAt(0);
		}
		System.out.println(res);
	}
}
