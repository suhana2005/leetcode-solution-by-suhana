class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int total = 0;
        int direct = 0;
        
        // Ensure start is less than destination
        if (start > destination) {
            int temp = start;
            start = destination;
            destination = temp;
        }
        
        for (int i = 0; i < distance.length; i++) {
            total += distance[i];
            if (i >= start && i < destination) {
                direct += distance[i];
            }
        }
        
        return Math.min(direct, total - direct);
    }
}
