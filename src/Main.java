import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<Integer> nums2 = new ArrayList<>(List.of(8, 1, 2, 3, 4, 4, 0, 5, 6, 7));
        List<String> strings = new ArrayList<>(List.of("один", "два", "три","два", "три", "три","два","два","два"));
        showOnlyOdd(nums);
        showOnlyEven(nums2);
        showOnlyUniq(strings);
        showDubles(strings);
    }
    static void showOnlyOdd(List<Integer> nums){
        List<Integer> numsCopy=new ArrayList<>(nums);
        for (Integer i:nums){
            if (i%2==0){
                numsCopy.remove(i);
            }
        }
        System.out.println(numsCopy);
    }

    static void showOnlyEven(List<Integer> nums){
        Set<Integer> newNums = new HashSet<>();
        Collections.sort(nums);
        for (int i:nums){
            if (i%2==0){
                newNums.add(i);
            }
        }
        System.out.println(newNums);
    }

    static void showOnlyUniq(List<String> words){
        Set<String> newWords = new HashSet<>(words);
        System.out.println(newWords);
    }

    static void showDubles(List<String> words){
        Map<String, Integer> countMap = new HashMap<>();
        int counter;
        for (String word:words){
            if(countMap.containsKey(word)){
                counter = countMap.get(word)+1;
                countMap.put(word,counter);
            }
            else{
                countMap.put(word,1);
            }
        }
        System.out.println(countMap.values());
    }
}