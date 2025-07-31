package RemoveDuplicatesFrom_sortedArray;
    class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0, i =0;
        for(int j = 1; j<=nums.length-1;j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
       return i + 1;
    
    }
   
}

