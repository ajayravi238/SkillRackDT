import java.util.*;
public class TiltedRectanglePattern {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=0; i<num; i++) {
		    for(int j=i; j<num-1; j++) {
		        System.out.print("-");
		    }
		    for(int j=0; j<num; j++) {
		        if(j == 0 || i == 0 || j == num-1 || i == num-1) {
		            System.out.print("*");
		        }
		        else {
		            System.out.print("-");
		        }
		    }
		    System.out.println();
		}
	}
}
