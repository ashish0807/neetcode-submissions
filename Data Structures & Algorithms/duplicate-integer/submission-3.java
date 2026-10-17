class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        //We can use hashSet 
        Set<Integer> set = new HashSet<>();

        for(int i:nums){
            if(!set.add(i)){
                return true;
            }
        }

        return false;


    }
}