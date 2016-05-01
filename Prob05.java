import java.io.*;
import java.util.*;

public class Prob05 {
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("Prob05.in.txt"));
        int T = in.nextInt();
        String buff = in.nextLine();
        

        for(int i=0; i<T; i++) {
        	String mon = in.nextLine();
        	System.out.println("Total of the bill: "+mon);
        	Double num = Double.parseDouble(mon.substring(1));
        	
        	if(num!=0.00){
        	
        	Double f = (num*15.00)/100.00;
        	Double e = (num*18.00)/100.00;
        	Double t = (num*20.00)/100.00;
        	
        	f = Math.round(f*100.0)/100.0;
        	e = Math.round(e*100.0)/100.0;
        	t = Math.round(t*100.0)/100.0;
        	
        	System.out.print("15% = $");
        	System.out.printf("%.2f\n", f);
        	System.out.print("18% = $");
        	System.out.printf("%.2f\n", e);
        	System.out.print("20% = $");
        	System.out.printf("%.2f", t);
        	if (i != T-1){
        		System.out.println("");
        	}
        	} else {
        		System.out.println("15% = $0");
        		System.out.println("18% = $0");
        		System.out.println("20% = $0");
        	}
        }
        in.close();
        
    }
}
