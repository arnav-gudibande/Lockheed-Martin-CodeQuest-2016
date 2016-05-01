import java.io.*;
import java.util.*;

public class Prob11 {
    public static String dict = "abcdefghijklmnopqrstuvwxyz";
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("Prob11.in.txt"));

        int T = in.nextInt();
        String trash = in.nextLine();

        for(int i=0; i<T; i++) {
        	String function = in.nextLine();
        	if(function.equals("ENCRYPT")) {
        		String cipher = in.nextLine();
        		int Te = in.nextInt();
        		String trash2 = in.nextLine();
        		
        		for(int x=0; x<Te; x++) {
        			String dis = in.nextLine();
        			String ans = encrypt(dis, cipher);
        			System.out.println(ans);
        		}
        	} else {
        		String ciph2 = in.nextLine();
        		int Td = in.nextInt();
        		String trash3 = in.nextLine();
        		
        		for(int d=0; d<Td; d++) {
        			String disD = in.nextLine();
        			String ans2 = decrypt(disD, ciph2);
        			System.out.println(ans2);
        		}
        	}
        	System.out.println();
        }
        in.close();
    }
    
    public static String encrypt(String encrypt, String cipher) {
    	encrypt = encrypt.trim();
    	String ans = "";
    	
    	for(int i=0; i<encrypt.length(); i++) {
    		String c = encrypt.substring(i,i+1);
    		if (c.equals(" ")){
    			ans += " ";
    			continue;
    		}
    		boolean uppercase = true;
    		if (c.charAt(0) > 90){
    			uppercase = false;
    		}
    		
    		c = c.toLowerCase();
    		
    		int index = dict.indexOf(c);

    		if (uppercase){
    			ans += cipher.substring(index, index+1).toUpperCase();
    		}else {
    			ans += cipher.substring(index, index+1);
    		}
    		
    		
    	}
    	return ans;
    }
    
    public static String decrypt(String encrypt, String cipher) {
    	encrypt = encrypt.trim();
    	String ans = "";
    	
    	for(int i=0; i<encrypt.length(); i++) {
    		String c = encrypt.substring(i,i+1);
    		if (c.equals(" ")){
    			ans += " ";
    			continue;
    		}
    		boolean uppercase = true;
    		if (c.charAt(0) > 90){
    			uppercase = false;
    		}
    		
    		c = c.toLowerCase();
    		
    		int index = cipher.indexOf(c);
    		if (uppercase){
    			ans += dict.substring(index, index+1).toUpperCase();
    		}else {
    			ans += dict.substring(index, index+1);
    		}
    		
    		
    	}
    	return ans;
    }
}
