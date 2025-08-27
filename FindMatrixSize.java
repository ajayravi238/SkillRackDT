import java.util.*;
public class FindMatrixSize {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<>();
		while(sc.hasNextLine()) {
		    al.add(sc.nextLine());
		}
		int row = 1, col = 1;
		for(int i=0; i<al.size()-1; i++) {
		    String[] arr = al.get(i).split(" ");
		    String[] brr = al.get(i+1).split(" ");
		    if(arr.length == brr.length) {
		        row++;
		        col = arr.length;
		    }
		    else {
		        System.out.println(row + " " + col);
		        row = 1;
		        col = brr.length;
		    }
		}
		System.out.println(row + " " + col);
	}
}
