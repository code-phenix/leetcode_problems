class Solution {
//      public static int binarySearch(int arr[],int start,int end,int key){
//         if(start<=end){
//             int mid=start+(end-start)/2;
//             if(arr[mid]==key){
//                 return mid;
//             }
//              if(arr[mid]>key){
//                 return binarySearch(arr, start, mid-1, key);
//             }
//             else{
//                 return binarySearch(arr, mid+1, end, key);
//             }
        
            
//         }
//         return -1;   
//     }   
    public int[] twoSum(int[] numbers, int target) {
        //using binary Search
   /*     for(int i=0;i<numbers.length;i++){
            
            int check=binarySearch(numbers,i+1,numbers.length-1,(target-numbers[i]));
            if(check!=-1){
                return new int[]{(i+1),(check+1)};
            }
        }
        return new int[]{};*/
        int left=0,right=numbers.length-1;
        while(left<right){
            if(numbers[left]+numbers[right]==target){
                return new int[]{left+1,right+1};
            }
            if(numbers[left]+numbers[right]<target)
                left++;
            else
                right--;
        }
        return new int[]{};
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Two Sum II - Input array is sorted.
//Memory Usage: 39 MB, less than 76.21% of Java online submissions for Two Sum II - Input array is sorted.
