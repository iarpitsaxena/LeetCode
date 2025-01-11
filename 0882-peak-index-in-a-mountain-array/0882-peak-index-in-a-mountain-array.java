class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0 ;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] < arr[mid + 1])
                start = mid + 1; //because we know that mid+1 is greater than mid; so you can use +1.
            else if(arr[mid] > arr[mid + 1])
                end = mid;// you are in decr. part
                          // this may be ans. but look at left
                          // this is why end != mid - 1
        }
        return start;
    }
}