import java.util.*;

public class Main {
    public static ArrayList<Integer> numsSort(ArrayList<Integer> nums) {
        List<Integer> tempNums = new ArrayList<>();
        Collections.sort(nums);
        for (int i = 0; i < nums.size(); i++) {
            if (!tempNums.contains(nums.get(i)) & (nums.get(i) % 2 == 0)) {
                tempNums.add(nums.get(i));
            }
        }
        return (ArrayList<Integer>) tempNums;
    }

    public static ArrayList<Integer> numsOddPrint(ArrayList<Integer> nums) {
        List<Integer> tempNums = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                tempNums.add(nums.get(i));
            }
        }
        return (ArrayList<Integer>) tempNums;
    }

    public static ArrayList<String> uniqueWorlds(ArrayList<String> strings) {
        List<String> tempWorlds = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            if (!tempWorlds.contains(strings.get(i))) {
                tempWorlds.add(strings.get(i));
            }
        }
        return (ArrayList<String>) tempWorlds;
    }

    public static ArrayList<String> dublicateWorlds(ArrayList<String> strings) {
        Map<String, Integer> tempMap = new HashMap<>();
        for (String stringVariable : strings) {
            if (!tempMap.containsKey(stringVariable)) {
                tempMap.put(stringVariable, 0);
            }
            if (tempMap.containsKey(stringVariable)) {
                tempMap.put(stringVariable, tempMap.get(stringVariable) + 1);
            }
        }
        System.out.println(tempMap);
        return null;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> strings = new ArrayList<>(List.of("один", "один", "два", "два", "два", "три", "три", "три"));
        System.out.println(numsOddPrint((ArrayList<Integer>) nums));
        System.out.println(numsSort((ArrayList<Integer>) nums));
        System.out.println(uniqueWorlds((ArrayList<String>) strings));
        dublicateWorlds((ArrayList<String>) strings);
    }
}


