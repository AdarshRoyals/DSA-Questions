class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int rem = target - nums[i];
            if(h.containsKey(rem)){
                return new int[]{h.get(rem),i};
            }
            h.put(nums[i],i);
        }
        return new int[]{};
    }
}
