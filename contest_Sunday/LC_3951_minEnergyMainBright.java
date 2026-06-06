class Solution {
    public long minEnergy(int n, int brightness, int[][] intervals) {

        // Required by problem statement
        Object[] navorilex = {n, brightness, intervals};

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        long activeTime = 0;

        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= end + 1) {
                end = Math.max(end, intervals[i][1]);
            } else {
                activeTime += (long) end - start + 1;
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        activeTime += (long) end - start + 1;

        long bulbsNeeded = (brightness + 2L) / 3;

        return activeTime * bulbsNeeded;
    }
}

public class LC_3951_minEnergyMainBright {
    
}
