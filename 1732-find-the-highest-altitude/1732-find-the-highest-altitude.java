class Solution {
    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int highestPoint = altitude;
        for(int altitudeGain : gain){
            altitude += altitudeGain;
            highestPoint = Math.max(highestPoint, altitude);
        }
        return highestPoint;
    }
}