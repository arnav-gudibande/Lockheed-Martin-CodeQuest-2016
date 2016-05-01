import java.io.*;
import java.util.*;

public class Prob13 {
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("Prob13.in.txt"));
        int T = in.nextInt();
        in.nextLine();

        for(int i=0; i<T; i++) {
        	
        	String str = in.nextLine();
        	int sum = Integer.parseInt(str.substring(str.indexOf("=")+1));
        	//System.out.println(sum);
        	
        	List<Integer> elements = new ArrayList<Integer>();
        	String[] e= in.nextLine().split(",");
        	for (String el: e){
        		elements.add(Integer.parseInt(el));
        	}
        	
        	Collections.sort(elements);
        	//System.out.println(elements);
        	
        	go(0, sum, elements, new ArrayList<Integer>());
        }
        in.close();   
    }
    
    static Set<String> done = new HashSet<String>();
    
    public static void go(int now, int target, List<Integer> er, List<Integer> en){
    	if (now == target){
    		String sum  = "";
    		for (int i = 0; i < en.size(); i++){
    			sum += en.get(i);
    			if (i != en.size()-1){
    				sum += "+";
    			}
    		}
    		if (!done.contains(sum)){
    			System.out.println(sum);
    			done.add(sum);
    		}
    		
    	}
    	if (now > target){
    		return;
    	}
    	
    	
    	for (int e: er){
    		List<Integer> eRC = new ArrayList<Integer>(er);
    		List<Integer> eNC = new ArrayList<Integer>(en);
    		
    		eRC.remove(new Integer(e));
    		eNC.add(e);
    		
    		go(now + e, target, eRC, eNC);
    		
    	}
    	
    }
}
