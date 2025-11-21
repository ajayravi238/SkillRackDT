import java.util.*;
public class MinDaysBuyFoodOnIsland {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int T = sc.nextInt();
		if(X < Y) {
		    System.out.println(-1);
		    return;
		}
		int sundays = T/7;
		int buyDays = T-sundays;
		int foodNeed = T*Y;
		int canBuy = buyDays*X;
		if(canBuy <= foodNeed) {
		    System.out.println(-1);
		    return;
		}
		System.out.println((int) Math.ceil((double)foodNeed/X));
	}
}
