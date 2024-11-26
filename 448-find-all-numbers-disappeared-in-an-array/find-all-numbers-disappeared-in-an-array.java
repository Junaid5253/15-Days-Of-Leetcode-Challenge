class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        for(int i = 0;i<n;i++){
            int num = Math.abs(nums[i]) - 1;//index finding 
            if(nums[num] > 0){
                nums[num] = -nums[num];
            }
        }
        for(int i = 0;i<n;i++){
            if(nums[i] > 0){
                result.add(i+1);
            }
        }
        return result;
    }
}