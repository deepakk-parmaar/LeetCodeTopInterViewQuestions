import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        int max = 0;
        Set<Integer> set = new HashSet<>();
        for(int val : nums) set.add(val);
        for(int i : nums){
            if(set.contains(i-1)) continue;
            int total = 0;
            while(set.remove(i++)){
                total++;
            }
            if(total > max) max = total;
        }
        return max;
    }
}