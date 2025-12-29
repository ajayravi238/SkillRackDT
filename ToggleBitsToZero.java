import java.util.*;

public class ToggleBitsToZero
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        String[] bin = new String[N];
        for(int i=0; i<N; i++) {
            bin[i] = Integer.toBinaryString(arr[i]);
            StringBuilder sb = new StringBuilder(bin[i]).reverse();
            for(int j=0; j<bin[i].length(); j++) {
                if(j%2 == 0) {
                    sb.setCharAt(j, '0');
                }
            }
            int a = Integer.parseInt(sb.reverse().toString(), 2);
            sum += a;
        }
        System.out.println(sum);
    }
}
