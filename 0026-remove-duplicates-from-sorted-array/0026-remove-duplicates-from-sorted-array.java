class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int k=1 , write = 0;
        for (int i=1 ; i<nums.length ;i++){
            if (nums[write] != nums[i]){
                write++;
                nums[write] = nums[i];
                k++;
            }
        }
        return k;
    }
}