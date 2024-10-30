class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for (int j = 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target && j != i){
                    return new int[]{i, j};
                }
            }
        }
        return null;        
    }
}