class Solution {
    public void rotate(int[] nums, int k) {
        rotateArray(nums,0,nums.length-1);
        rotateArray(nums,0,k-1);
        rotateArray(nums,k,nums.length-1);
    }
    private void rotateArray(int[] nums,int start,int last){
        while(start<last){
            int temp = nums[start];
            nums[start] = nums[last];
            nums[last] = temp;
            start++;
            last--;
        }
    }
}
