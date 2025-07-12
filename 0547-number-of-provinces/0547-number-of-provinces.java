class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visit = new boolean[n];
        int count = 0;
        for(int i = 0;i < n;i++){
            if(visit[i] == false){
                count++;
                dfs(i, isConnected,visit);
            }
        }
        return count;
    }

    private static void dfs(int node, int[][] isConnected, boolean[] visit){
        visit[node] = true;
        for (int i = 0; i < isConnected.length; i++) {
            if (isConnected[node][i] == 1 && !visit[i]) {
                dfs(i, isConnected, visit);
            }
        }
    }
}