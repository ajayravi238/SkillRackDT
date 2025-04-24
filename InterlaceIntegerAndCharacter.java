import java.util.*;

public class InterlaceIntegerAndCharacter
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] N = new int[num];
		for(int i=0; i<num; i++) {
		    N[i] = sc.nextInt();
		}
		sc.nextLine();
        String str = sc.nextLine();
		for(int i=0; i<num; i++) {
		    System.out.print(N[i] + "" + str.charAt(i));
		}
	}
}
