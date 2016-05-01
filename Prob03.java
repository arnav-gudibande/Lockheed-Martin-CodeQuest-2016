import java.io.*;
import java.util.*;

public class Prob03 {
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("Prob03.in.txt"));
        int T = in.nextInt();
        String s = in.nextLine();

        for(int i=0; i<T; i++) {
        	String line = in.nextLine();
        	String[] arr = line.split(", ");
        	double a = Double.parseDouble(arr[0]);
        	double b = Double.parseDouble(arr[1]);        	
        	double c = Double.parseDouble(arr[2]);
        	if(((a + b) <= c) || ((b + c) <= a) || ((a+c) <= b)) {
        		System.out.print("Not a Triangle");
        		System.out.println("");
        	}
        	else {
        		if(a == b && b == c) {
        			System.out.print("Equilateral");
        			System.out.println("");
        		}
        		else if(a != b && b!= c && c != a) {
        			System.out.print("Scalene");
        			System.out.println("");
        		}
        		else {
        			System.out.print("Isosceles");
        			System.out.println("");
        		}
        	}

        	
        }
        in.close();
        
    }
}
