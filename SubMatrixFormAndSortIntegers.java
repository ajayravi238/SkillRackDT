import java.util.*;
public class SubMatrixFormAndSortIntegers {

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
		List<Integer> l = new ArrayList<>();
		for(int i=0; i<=R-3; i+=3) {
		    for(int j=0; j<=C-3; j+=3) {
		        int[][] a = new int[3][3];
		        for(int x=i; x<i+3; x++) {
		            for(int y=j; y<j+3; y++) {
		                a[x-i][y-j] = arr[x][y];
		            }
		        }
		        String num3 = "";
		        String num4 = "";
		        for(int x=0; x<3; x++) {
		            String num1 = "";
		            String num2 = "";
		            for(int y=0; y<3; y++) {
		                num1 += a[x][y];
		                num2 += a[y][x];
		                if(x == y) {
		                    num3 += a[x][y];
		                }
		                if((x+y) == 2) {
		                    num4 += a[x][y];
		                }
		            }
		            l.add(Integer.parseInt(num1));
		            l.add(Integer.parseInt(num2));
		        }
		        l.add(Integer.parseInt(num3));
		        l.add(Integer.parseInt(num4));
		    }
		}
		Collections.sort(l);
		for(int i : l) {
		    System.out.print(i + " ");
		}
	}
}
