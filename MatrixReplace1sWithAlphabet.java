import java.util.*;
public class MatrixReplace1sWithAlphabet {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		char[][] arr = new char[R][C];
		for(int i=0; i<R; i++) {
		    for(int j=0; j<C; j++) {
		        arr[i][j] = sc.next().charAt(0);
		    }
		}
		char ch = sc.next().charAt(0);
		for(int i=0; i<R; i++) {
		    for(int j=0; j<C; j++) {
		        if(arr[i][j] == '1') {
		            arr[i][j] = ch++;
		            if(ch == 123) {
		                ch = 'a';
		            }
		            if(ch == 91) {
		                ch = 'A';
		            }
		        }
		    }
		}
		for(int i=0; i<R; i++) {
		    for(int j=0; j<C; j++) {
		        System.out.print(arr[i][j] + " ");
		    }
		    System.out.println();
		}
	}
}
