import java.util.*;
public class GenerateNumberFromMatrix {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[9][9];
		for(int i=0; i<9; i++) {
		    for(int j=0; j<9; j++) {
		        arr[i][j] = sc.nextInt();
		    }
		}
		sc.nextLine();
		String str = sc.nextLine();
		long sum = 0;
		for(int i=0; i<9; i++) {
		    String newString = "";
		    int x = Character.getNumericValue(str.charAt(i));
		        for(int n=0; n<x; n++) {
		          newString += String.valueOf(arr[n][i]);
		        }
		        sum += Integer.parseInt(newString);
		}
		System.out.println(sum);
	}
}
