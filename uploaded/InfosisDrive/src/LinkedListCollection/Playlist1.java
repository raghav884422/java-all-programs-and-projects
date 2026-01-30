package LinkedListCollection;
import java.util.*;

public class Playlist1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of songs
        int n = sc.nextInt();
        LinkedList<String> playlist = new LinkedList<>();
 
        sc.nextLine(); // consume newline
        for (int i = 0; i < n; i++) {
            String song = sc.nextLine();
            playlist.add(song);
        }
        
        // Reverse the linked list
        reverseLinkedList(playlist);
        
        // Print the reversed linked list
        for (String song : playlist) {
            System.out.print(song + " ");
        }
        
        sc.close();
    }
    
    // Function to reverse the linked list
    public static void reverseLinkedList(LinkedList<String> playlist) {
        Collections.reverse(playlist);
    }
}
