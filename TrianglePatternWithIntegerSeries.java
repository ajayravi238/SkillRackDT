import java.util.*;
public class TrianglePatternWithIntegerSeries {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String str = "";
		for(int i=1; i<=num*num; i++) {
		    str += i;
		}
		System.out.println(str);
		int col = 0, k = 0;
		for(int i=0; i<num; i++) {
		    for(int j=i; j<num-1; j++) {
		        System.out.print("*");
		        col++;
		    }
		    for(int j=0; j<((i+1)*2)-1; j++) {
		        System.out.print(str.charAt(k));
		        k++;
		    }
		    System.out.println(" ");
		}
	}
}
