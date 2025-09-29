import java.util.*;
public class FillMatrixWithAlphabet {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		int[][] arr = new int[R][C];
		for(int i=0; i<R; i++) {
		    for(int j=0; j<C; j++) {
		        arr[i][j] = sc.nextInt();
		    }
		}
		char ch = sc.next().charAt(0);
		char[][] chArr = new char[R][C];
		char chOne = ch, chZero = ch;
		for(int i=0; i<R; i++) {
		    for(int j=0; j<C; j++) {
		        if(arr[i][j] == 1) {
		            chArr[i][j] = chOne;
		            chOne = (char) ((int) chOne + 1);
		            if((int) chOne == 123) {
		                chOne = 'a';
		            }
		            if((int) chOne == 91) {
		                chOne = 'A';
		            }
		        }
		        else {
		            chArr[i][j] = chZero;
		            chZero = (char) ((int) chZero - 1);
		            if((int) chZero == 64) {
		                chZero = 'Z';
		            }
		            if((int) chZero == 96) {
		                chZero = 'z';
		            }
		        }
		    }
		}
		for(int i=0; i<R; i++) {
		    for(int j=0; j<C; j++) {
		        System.out.print(chArr[i][j] + " ");
		    }
		    System.out.println();
		}
	}
}
