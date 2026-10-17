class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        //using build-in sort method
        Arrays.sort(nums);
        boolean flag = false;

        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                flag = true;
            }
        }

        return flag;


    }
}