class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0;i < numCourses;i++){
            adj.add(new ArrayList<>());;
        }
        int[] indegree = new int[numCourses];
        for(int[]edge : prerequisites){
            adj.get(edge[1]).add(edge[0]);
            indegree[edge[0]]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0;i < numCourses;i++){
            if(indegree[i]== 0){
                queue.add(i);
            }
        }

        int[] result = new int [numCourses];
        int index = 0;
        while(!queue.isEmpty()){
            int current = queue.poll();
            result[index++] = current;
            for(int next : adj.get(current)){
                indegree[next]--;
                if(indegree[next]==0){
                    queue.offer(next);
                }
            }
        }
        return index == numCourses ? result : new int[0];
    }
}