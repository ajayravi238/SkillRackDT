import java.util.*;
public class PrimeNumberThreeDigit {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		String str = a+""+b+""+c;
		ArrayList<String> com = new ArrayList<>();
		for(int i=0; i<3; i++) {
		    com.add(String.valueOf(str.charAt(i)));
		}
		for(int i=0; i<3; i++) {
		    for(int j=0; j<3; j++) {
		        if(i != j) {
		            com.add(str.charAt(i) + "" + str.charAt(j));
		        }
		    }
		}
		for(int i=0; i<3; i++) {
		    for(int j=0; j<3; j++) {
		        for(int k=0; k<3; k++) {
		            if(i != j && j != k && i != k) {
		                com.add(str.charAt(i) + "" + str.charAt(j) + "" + str.charAt(k));
		            }
		        }
		    }
		}
		TreeSet<Integer> res = new TreeSet<>();
		
		for(String i : com) {
		    if(isPrime(Integer.parseInt(i))) {
		        res.add(Integer.parseInt(i));
		    }
		}
		for(int i : res) {
		    System.out.print(i + " ");
		}
	}
	public static boolean isPrime(int n) {
	    if(n == 0 || n == 1) {
	        return false;
	    }
	    for(int i=2; i<n; i++) {
	        if(n%i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
}
