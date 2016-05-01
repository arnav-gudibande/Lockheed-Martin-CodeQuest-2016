import java.io.*;
import java.util.*;

public class Prob01 {
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("Prob01.in.txt"));
        int T = in.nextInt();
        

        for(int i=0; i<T; i++) {
        	int num = in.nextInt();
        	for(int b=0; b<num; b++) {
        		
        		for(int x=0; x<num; x++) {
        			if(x!=num-1){
        				System.out.print("# ");
        			} else {
        				System.out.print("#");
        			}
        		}
        		System.out.println("");
        	}
        }
        in.close();
        
    }
}
