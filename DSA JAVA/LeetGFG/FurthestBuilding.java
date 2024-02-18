package LeetGFG;
// Wrong approach   /// use priority queue and heap
public class FurthestBuilding {
    public static void main(String[] args) {
        int[] arr = {4,2,7,6,9,14,12};
        int bricks=5;
        int ladders=1;
        System.out.println(furthestBuilding(arr, bricks, ladders));
    }
    public static int furthestBuilding(int[] heights, int bricks, int ladders) {
        int currentindex=0;
        for(int i=0; i<heights.length-1; i++){
            currentindex=i;
            if(heights[i] > heights[i+1]){
                continue;
            }else{
                while(bricks !=0 || ladders !=0){
                    if((heights[i+1]-heights[i]) <= bricks){
                        bricks -= heights[i+1]-heights[i];
                    }else{
                        ladders--;
                    }
                }
                
            }
        }
        return currentindex+1;
    }
}

// if(bricks !=0 || ladders !=0){
//     if((heights[i+1]-heights[i]) <= bricks){
//         bricks -= heights[i+1]-heights[i];
//     }else{
//         ladders--;
//     }
// }