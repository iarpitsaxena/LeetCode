class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] prerequisite : prerequisites){
            int course = prerequisite[0];
            int pre = prerequisite[1];
            adj.get(pre).add(course);
        }
        boolean[] visited = new boolean[numCourses];
        boolean[] path = new boolean[numCourses];

        for(int i =0;i < numCourses;i++){
            if(!visited[i]){
                if(dfs(i,adj,visited,path)){
                    return false;
                }
            }
        }
        return true;
    }

    boolean dfs(int node, ArrayList<ArrayList<Integer>> adj,  boolean[] visited,  boolean[] path){
        path[node] = true;
        visited[node] = true;
        for(int next : adj.get(node)){
            if(!visited[next]){
                if(dfs(next,adj,visited,path)){
                    return true;
                }
            } else if(path[next]){
                return true;
            }
        }
        path[node] = false;
        return false;
    }
}