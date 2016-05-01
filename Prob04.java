import java.io.*;
import java.util.*;

public class Prob04 {
    
	public static int count = 0;
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("Prob04.in.txt"));
        int T = in.nextInt();
        String trash = in.nextLine();
        
        for(int i=0; i<T; i++) {
        	String x = in.nextLine();
        	int c = (x.length()/2)-1;
        	String first = x.substring(0,c+1);
        	String last = x.substring(c+2);
    
        	for(int f = 0; f<first.length(); f++) {
        		
        		if(last.contains(first.substring(f,f+1))) {
        			count++;
        		}
        	}
        	
        	if(count==first.length() && count==last.length() && !first.equals(last)) {
        		System.out.println(x+ " = ANAGRAM");
        	} else {
        		System.out.println(x+ " = NOT AN ANAGRAM");
        	}
        	count=0;
        }
        
        
        in.close();
        
    }
}
