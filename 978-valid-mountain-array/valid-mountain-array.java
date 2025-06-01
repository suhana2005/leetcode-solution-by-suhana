class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3)
            return false;
        int i = 0;
        while (i < arr.length - 1 && arr[i] < arr[i + 1]) { // checking it is increasing and it find the peak value
            i++;
        }
        if (i == 0 || i == arr.length - 1){
        return false;
        }
    
        while (i < arr.length - 1 && arr[i] > arr[i + 1]) { // checking it is decreasing after the peak value 
             i++;
            }
            return (i == arr.length - 1);
    }
}    