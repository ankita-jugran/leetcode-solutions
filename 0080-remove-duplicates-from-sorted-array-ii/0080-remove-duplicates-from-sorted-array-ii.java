class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1, count = 1, write = 0;

        for (int i = 1 ; i < nums.length ; i++){

            if ( nums[i] == nums[write] ){
                count++;
                if (count < 3) {
                    nums[write+1] = nums[i];
                    write++;
                    k++;
                }
            }

            else if ( nums[i] != nums[write]){
                nums[write+1] = nums[i];
                write++;
                k++;
                count = 1;
            }
        } 
        return k;
    }
}