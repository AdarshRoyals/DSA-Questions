class Solution {
    public boolean check(int[] nums) {
        int b[] = nums.clone();
        int a[] = new int[nums.length];
        Arrays.sort(b);
        for(int x=1;x<=nums.length;x++){
            for(int i=0;i<nums.length;i++){
                a[i] = b[(i+x)%nums.length];
            }
            if (Arrays.equals(a, nums)){
                return true;
            }
        }
        return false;
    }
}
