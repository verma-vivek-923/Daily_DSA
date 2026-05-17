import java.util.*;

class Solution {

    public long[] minCost(int n, int[] prices, int[][] roads) {

        // Step 1: Build graph
        List<long[]>[] graph = new ArrayList[n];

        for(int i = 0; i < n; i++){
            graph[i] = new ArrayList<>();
        }

        for(int[] r : roads){

            int u = r[0];
            int v = r[1];
            int cost = r[2];
            int taxi = r[3];

            long effectiveCost = (long)cost * (1 + taxi);

            graph[u].add(new long[]{v, effectiveCost});
            graph[v].add(new long[]{u, effectiveCost});
        }

        // Step 2: Answer array
        long[] ans = new long[n];

        // Step 3: Min Heap
        PriorityQueue<long[]> pq =
            new PriorityQueue<>((a,b) -> Long.compare(a[1], b[1]));

        // Initially buy locally
        for(int i = 0; i < n; i++){

            ans[i] = prices[i];

            pq.offer(new long[]{i, ans[i]});
        }

        // Step 4: Multi-source Dijkstra
        while(!pq.isEmpty()){

            long[] cur = pq.poll();

            int node = (int)cur[0];
            long cost = cur[1];

            // Skip outdated state
            if(cost > ans[node]) continue;

            // Explore neighbors
            for(long[] nei : graph[node]){

                int next = (int)nei[0];

                long edgeCost = nei[1];

                long newCost = cost + edgeCost;

                if(newCost < ans[next]){

                    ans[next] = newCost;

                    pq.offer(new long[]{next, newCost});
                }
            }
        }

        return ans;
    }
}
public class LC_3928_MinimumCostApple {
    public static void main(String[] args) {
        Solution s1=new Solution();
    }
    
}
