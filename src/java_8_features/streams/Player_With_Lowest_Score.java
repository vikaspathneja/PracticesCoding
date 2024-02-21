package java_8_features.streams;

import java.util.*;

class Player {
    String name;
    int runs;

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", runs=" + runs +
                '}';
    }

    public Player(String name, int runs) {
        this.name = name;
        this.runs = runs;

    }
}

public class Player_With_Lowest_Score {
    public static void main(String[] args) {
        //We need to get player whose run is lowest we have player name and its runs
        //VIRAT 103
        //RAHUL 0
        //GILL  83


        //first way is take player name and runs in object ,create list and then sort
        List<Player> mlist = Arrays.asList(new Player("virat", 103), new Player("rahul", 0), new Player("gill", 83));
        //mlist.sort((p1,p2)-> p1.runs-p2.runs);
        mlist.sort(Comparator.comparingInt(player -> player.runs));
        Player lowestScorePlayer = mlist.stream().limit(1).findFirst().get();
        System.out.println(lowestScorePlayer);

        //using TreeMap
        Map<Integer, String> treeMap = new TreeMap<>(Comparator.naturalOrder());
        treeMap.put(0, "rahul");
        treeMap.put(103, "virat");
        treeMap.put(86, "gill");
        System.out.println("Player with lowest run Using Tree Map: " + treeMap.entrySet().stream().limit(1).findFirst().get());

        Map<Integer, String> hm = new HashMap<>();
        hm.put(0, "rahul");
        hm.put(103, "virat");
        hm.put(86, "gill");
        System.out.println("Player with lowest run Using Hash Map: " );
        System.out.println(hm.entrySet().stream().sorted(Comparator.comparingInt(Map.Entry::getKey)).findFirst().get().getValue());

        System.out.println("Player with lowest run Using Hash Map with min function: ");
        System.out.println(hm.entrySet().stream().min(Comparator.comparingInt(Map.Entry::getKey)).get().getValue());

        Map<String, Integer> hm2 = new HashMap<>();
        hm2.put("rahul", 0);
        hm2.put("virat", 103);
        hm2.put("gill", 86);

        System.out.println("Player with lowest run Using Hash Map with key as player name: ");
        String playername = hm2.entrySet().stream().min(Comparator.comparingInt(Map.Entry::getValue)).get().getKey();
        System.out.println(playername);






    }
}
