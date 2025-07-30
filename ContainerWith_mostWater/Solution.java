package ContainerWith_mostWater;
class Solution {
    public int maxArea(int[] height) {
        int left=0, right= height.length-1, maxArea= 0;
        while(left<right){
            int ht= Math.min(height[left],height[right]);
            int width = right - left ;
            int area = ht * width;
            maxArea = Math.max(area,maxArea);
        if(height[left] < height[right]){
            left++;
        }else{
            right--;
        }
        }
        return maxArea;
    }
}