import java.util.*;

public class GetStringFromRows
{
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
		int X = sc.nextInt();
		int Y = sc.nextInt();
		String res = "";
		if(X < Y) {
			for(int i=X-1; i<Y; i++) {
				for(int j=0; j<C; j++) {
					res += arr[i][j];
				}
			}
		}
		else {
		    for(int i=X-1; i<R; i++) {
		        for(int j=0; j<C; j++) {
		            res += arr[i][j];
		        }
		    }
		    for(int i=0; i<Y; i++) {
		        for(int j=0; j<C; j++) {
		            res += arr[i][j];
		        }
		    }
		}
		System.out.println(res);
	}
}
