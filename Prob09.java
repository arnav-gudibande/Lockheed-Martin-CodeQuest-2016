import java.io.*;
import java.util.*;

public class Prob09 {
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("Prob09.in.txt"));
        int T = in.nextInt();
        in.nextLine();

        for(int i=0; i<T; i++) {
        	int zoom = in.nextInt();
        	double lat = in.nextDouble();
        	double lon = in.nextDouble();
        	
        	int x = (int) (((lon+180.0)/360.0)*Math.pow(2, zoom));
        	//System.out.println(x);
        	
        	int y = (int) ((1 - Math.log( Math.tan(lat*Math.PI/180) + 1/(Math.cos(lat*Math.PI/180)))/Math.PI)*Math.pow(2, zoom-1));
        	//System.out.println(y);
        	
        	System.out.println("http://tile.openstreetmap.org/" + zoom + "/" + x + "/" + y + ".png");
        }
        in.close();
        
    }
}
