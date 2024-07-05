import java.util.*;

public class TileMinimumCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the tiles as a space-separated string
        System.out.print("Enter the tiles (space-separated): ");
        String tilesInput = scanner.nextLine();
        String[] tiles = tilesInput.split(" ");

        // Read the target string
        System.out.print("Enter the target string: ");
        String target = scanner.nextLine();

        // Create a frequency map for the tiles
        Map<Character, Integer> tileFreq = new HashMap<>();
        for (String tile : tiles) {
            for (char c : tile.toCharArray()) {
                tileFreq.put(c, tileFreq.getOrDefault(c, 0) + 1);
            }
        }

        // Check if we can form the target string
        int count = 0;
        for (char c : target.toCharArray()) {
            if (tileFreq.containsKey(c) && tileFreq.get(c) > 0) {
                tileFreq.put(c, tileFreq.get(c) - 1);
            } else {
                System.out.println("Cannot form the target string.");
                System.out.println("Output: -1");
                return;
            }
        }

        // Calculate the minimum count of tiles used
        for (int freq : tileFreq.values()) {
            count += freq;
        }

        System.out.println("Output: " + count);
    }
}
