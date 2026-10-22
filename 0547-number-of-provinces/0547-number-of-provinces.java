class Solution {
    int n;
    public int findCircleNum(int[][] isConnected) {
        n = isConnected.length;
        boolean[] visited = new boolean[n];
        int province = 0;
        for(int i = 0;i < n;i++){
            if(!visited[i]){
                province++;
                bfs(i,isConnected,visited);
            }
        }
        return province;
    }

    private void bfs(int city, int[][] isConnected,boolean[] visited){
        Queue<Integer> queue = new LinkedList<>();
        visited[city] = true;
        queue.add(city);

        while(!queue.isEmpty()){
            int current = queue.poll();
            for(int neighbour = 0;neighbour < n;neighbour++){
                if(isConnected[current][neighbour] == 1 && !visited[neighbour]){
                    visited[neighbour] = true;
                    queue.offer(neighbour);
                }
            }
        }
    }
}