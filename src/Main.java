import java.util.*;

public class Main {


 /*   public ArrayList<Integer> numsOddPrint(ArrayList<Integer> nums) {
        List tempNums = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                tempNums.add(nums.get(i));
            }
            return tempNums;
        }

    }

    public ArrayList<String> uniqueWorlds(ArrayList<String> strings) {
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
    }*/

    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7);

        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        /*Задача 2*/

        List<Integer> nums1 = new ArrayList<>(List.of(1, 1, 2, 3, 6, 6, 5, 5, 4, 7));
        Set<Integer> sortNums = new LinkedHashSet<>();
        Collections.sort(nums1);
        for (Integer num1 : nums1) {
            if (num1 % 2 == 0) {
                sortNums.add(num1);
            }
        }
        List<Integer> nums2 = List.of(2,1, 1, 2, 3, 6, 4, 5, 5, 4, 7,8);
        Set<Integer> sortNums2 = new TreeSet<>();
        for (Integer num2 : nums2) {
            if (num2 % 2 == 0) {
                sortNums2.add(num2);
            }
        }
        System.out.println("sortNums");
        System.out.println(sortNums);
        System.out.println("____________________________________");
        System.out.println("sortNums2");
        System.out.println(sortNums2);
        System.out.println("____________________________________");
        /*Задача 3*/
        List<String> strings = List.of("один", "один", "два", "два", "два", "три", "три", "три");
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
    }

}

