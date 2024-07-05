import java.util.*;

public class TileArrangement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input tiles
        System.out.println("Enter space-separated list of tiles:");
        String[] tiles = scanner.nextLine().split(" ");

        // Input target string
        System.out.println("Enter the target string:");
        String target = scanner.nextLine();

        // Count occurrences of each letter in tiles
        Map<Character, Integer> tileCounts = new HashMap<>();
        for (String tile : tiles) {
            for (char c : tile.toCharArray()) {
                tileCounts.put(c, tileCounts.getOrDefault(c, 0) + 1);
            }
        }

        // Count occurrences of each letter in the target string
        Map<Character, Integer> targetCounts = new HashMap<>();
        for (char c : target.toCharArray()) {
            targetCounts.put(c, targetCounts.getOrDefault(c, 0) + 1);
        }

        // Check if target string can be formed
        for (char c : targetCounts.keySet()) {
            if (!tileCounts.containsKey(c) || tileCounts.get(c) < targetCounts.get(c)) {
                System.out.println(-1);
                return;
            }
        }

        // Calculate total number of tiles required
        int tileCount = 0;
        for (char c : targetCounts.keySet()) {
            tileCount += targetCounts.get(c);
        }

        // Output minimum number of tiles required
        System.out.println(tileCount);
    }
}
