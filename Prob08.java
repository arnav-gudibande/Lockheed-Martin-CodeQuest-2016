import java.io.*;
import java.util.*;

public class Prob08 {
    
	public static class Song implements Comparable{
		String name;
		String artist;
		Song(String n, String a){
			name = n;
			artist = a;
		}
		
		public int compareTo(Object o){
			Song otherSong = (Song) o;
			String other = otherSong.artist.toLowerCase();
			if (other.indexOf("the ") == 0){
				other = other.replace("the ", "");
			}
			
			//other.trim();
			
			
			
			String clean = artist.toLowerCase();
					if (clean.indexOf("the ") == 0){
						clean = clean.replace("the ", "");
					}
			//clean = clean.trim();
			
			if (clean.compareTo(other) != 0){
				return clean.compareTo(other);
			}
			
			return name.toLowerCase().compareTo(otherSong.name.toLowerCase());
		}
		
		public String toString(){
			return name + " - " + artist;
		}
	}
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("Prob08.in.txt"));
        int T = in.nextInt();
        
        for(int i=0; i<T; i++) {
        	int N = in.nextInt();
        	in.nextLine();
        	
        	List<Song> songs = new ArrayList<Song>();
        	for(int j=0; j<N; j++) {
        		String song = in.nextLine();
        		//System.out.println(song);
        		
        		String artist = song.substring(song.indexOf("-")+2);
        		String name = song.substring(0, song.indexOf("-")-1);
        		
        		songs.add(new Song(name, artist));
        	}
        	
        	Collections.sort(songs);
        	
        	
        	for (Song s: songs){
        		System.out.println(s);
        	}
        	
        }
        in.close();
        
    }
}
