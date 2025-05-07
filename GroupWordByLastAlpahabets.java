import java.util.*;
public class GroupWordByLastAlpahabets {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] arr=str.split(" ");
		Map<Character,List<String>> hm=new TreeMap<>(); 
		for(int i=0;i<arr.length;i++){
		    char ch=arr[i].charAt(arr[i].length()-1);
		    if(hm.containsKey(ch)){
		        hm.get(ch).add(arr[i]);
		    }
		    else{
		        ArrayList<String> t=new ArrayList<>();
		        t.add(arr[i]);
		    hm.put(ch,t);
		    }
		}
		for(Map.Entry<Character,List<String>> e:hm.entrySet()){
		  for(String w:(e.getValue())){
		      System.out.print(w+" ");
		  }
		  System.out.println();
		  
		}

	}
}
