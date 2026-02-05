import java.util.*;

public class ShiftAndCompareBits
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int X = sc.nextInt();
        String bin = Integer.toBinaryString(Integer.parseInt(N));
        String res = "";
        res += bin.substring(X);
        res += bin.substring(0, X);
        int count = 0;
        for(int i=0; i<bin.length(); i++) {
            if(bin.charAt(i) == res.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
