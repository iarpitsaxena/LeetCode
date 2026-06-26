class Solution {
    public int minMeetingRooms(int[][] intervals) {
        List<int[]> events = new ArrayList<>();
        for(int[] interval : intervals){
            events.add(new int[]{interval[0],1});
            events.add(new int[]{interval[1],-1});
        }
        Collections.sort(events,(a,b)->{
            if(a[0] == b[0]){
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });
        int rooms = 0;
        int maxRooms = 0;
        for(int[] event: events){
            rooms += event[1];
            maxRooms = Math.max(rooms,maxRooms);
        }
        return maxRooms;
    }
}