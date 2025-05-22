import java.util.*;
public class SortStringInCustomOrder {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String[] arr=new String[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextLine();
		}
		String str=sc.nextLine();
	
		 Map<Character,Integer> map=new HashMap<>();
		 for(int i=0;i<26;i++){
		     map.put(str.charAt(i),i);
		 }
		 Arrays.sort(arr,new CustomComparator(map));
	
	for(String word : arr){
	    System.out.println(word);
	}
    }

}
class CustomComparator implements Comparator<String>{
    private Map<Character,Integer> map;
    public CustomComparator(Map<Character,Integer> map){
        this.map=map;
    }
    
    @Override
    public int compare(String w1,String w2){
        int l1=w1.length();
        int l2=w2.length();
        int minLen=Math.min(l1,l2);
        
        for(int i=0;i<minLen;i++){
            char c1=w1.charAt(i);
            char c2=w2.charAt(i);
            int p1=map.get(c1);
            int p2=map.get(c2);
            if(p1!=p2){
                return p1-p2;
            }
        }
        return l1-l2;
    }
}
