class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events,Comparator.comparingInt(a -> a[0]));
        int n = events.length, count = 0,days = 0, index = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        while(!pq.isEmpty() || index < n){
            if(pq.isEmpty()){
                days = events[index][0];
            }
            while(index<n && events[index][0]<=days){
                pq.offer(events[index][1]);
                index++;
            }
            pq.poll();
            count++;
            days++;
            while(!pq.isEmpty() && pq.peek() < days){
                pq.poll();
            }
        }
        return count; 
    }
}