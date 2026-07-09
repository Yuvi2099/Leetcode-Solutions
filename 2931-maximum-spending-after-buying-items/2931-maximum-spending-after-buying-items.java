class Solution {
    public long maxSpending(int[][] values) {
        int n = values.length, m = values[0].length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for (int i = 0; i < n; i++) {
            pq.offer(new int[]{values[i][m-1], i, m-1});
        }
        long sum = 0;
        long day = 1;
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int val = curr[0], row = curr[1], col = curr[2];
            sum += (long) val * day;
            day++;
            if (col - 1 >= 0) {
                pq.offer(new int[]{values[row][col-1], row, col-1});
            }
        }
        return sum;
    }
}
