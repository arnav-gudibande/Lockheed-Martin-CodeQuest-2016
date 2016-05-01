import java.io.*;
import java.util.*;

public class Prob10 {
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("Prob10.in.txt"));
        int T = in.nextInt();
        

        for(int i=0; i<T; i++) {
        	
        	int N = in.nextInt();
        	in.nextLine();
        	
        	
        	int[] alts = new int[N];
        	int[] els = new int[N];
        	
        	for (int j = 0; j < N; j++){
        		String[] s = in.nextLine().split(",");
        		
        		int alt = Integer.parseInt(s[0]);
        		int el = Integer.parseInt(s[1]);
        		
        		alts[j] = alt;
        		els[j] = el;
        	}
        	
        	for (int j = 0; j < N; j++){
        		int alt = alts[j];
        		int el = els[j];
        		
        		int last = 0;
        		if (j > 0){
        			last = alts[j-1];
        		}
        		
        		
        		int next = 0;
        		if (j > 0){
        			next = els[j-1];
        		}
        		
        		
        		//System.out.println(alt + " " + next);
        		
        		boolean crash = alt + (alt-last) < el;
        		boolean warning = (alt-next) <= 500;
        		
        		if (crash){
        			System.out.println("PULL UP!");
        		}else if (warning){
        			System.out.println("Low Altitude!");
        		}else {
        			System.out.println("ok");
        		}
        		
        		last = alt;
        	}
        }
        in.close();
        
    }
}
