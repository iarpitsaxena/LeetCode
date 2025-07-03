class Solution {
    private record Job(int startTime, int endTime, int profit){}

    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        final int n = startTime.length;

        Job[] jobs = new Job[n];

        for(int i = 0;i< n;++i){
            jobs[i] = new Job(startTime[i],endTime[i],profit[i]);// yha basically aap ek naya object bna rhe ho and then sorting it.
        }

        Arrays.sort(jobs,Comparator.comparingInt(Job::startTime));// This line sorts the array of Job objects in ascending order of their startTime.
                                                                  //Comparator<Job> cmp = (Job j) -> j.startTime();

        for(int i = 0;i<n ;i++){
            startTime[i] = jobs[i].startTime;
        }

        return getMaxProfit(jobs);  
    }

    private int getMaxProfit(Job[] jobs){
        int maxProfit = 0;
        PriorityQueue<Job> minHeap = new PriorityQueue<>(Comparator.comparingInt(Job::endTime));
        for (Job job: jobs){
            while(!minHeap.isEmpty() && job.startTime>=minHeap.peek().endTime)
                maxProfit = Math.max(maxProfit,minHeap.poll().profit());
            minHeap.offer(new Job(job.startTime,job.endTime,job.profit+maxProfit));
        }

        while(!minHeap.isEmpty()){
            maxProfit = Math.max(maxProfit,minHeap.poll().profit);
        }
        return maxProfit;
    }
}