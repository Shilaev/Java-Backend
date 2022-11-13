package Algorithms;

import java.util.*;

public class SetCoveringProblem {
    public static void main(String[] args) {
        Set<String> statesNeeded = new HashSet<>(Set.of("mt", "wa", "or", "id", "nv", "ut", "ca", "az"));
        Hashtable<String, Set<String>> stations = new Hashtable<>();

        stations.put("kone", Set.of("id", "nv", "ut"));
        stations.put("ktwo", Set.of("wa", "id", "mt"));
        stations.put("kthhree", Set.of("or", "nv", "ca"));
        stations.put("kfour", Set.of("nv", "ut"));
        stations.put("kfive", Set.of("ca", "az"));

        Set<String> bestStations = new HashSet<>();
        while (!statesNeeded.isEmpty()){
            String bestStation = findBestStation(stations, statesNeeded);

            statesNeeded.removeAll(stations.get(bestStation));

            stations.remove(bestStation);
            bestStations.add(bestStation);
        }
        System.out.println(bestStations);

    }

    public static String findBestStation(Hashtable<String, Set<String>> stations, Set<String> statesNeeded) {
        Iterator<String> stationsIterator = stations.keys().asIterator();
        Set<String> states_covered = new HashSet<>();
        String bestStation = "";
        while (stationsIterator.hasNext()) {
            String currentStation = stationsIterator.next();
            Set<String> currentStationStatesCover = stations.get(currentStation);

            Set<String> covered = new HashSet<>(statesNeeded);
            covered.retainAll(currentStationStatesCover);
            if (covered.size() > states_covered.size()) {
                bestStation = currentStation;
                states_covered = covered;
            }
        }
        return bestStation;
    }
}
