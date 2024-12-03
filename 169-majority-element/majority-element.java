class Solution {
    public int majorityElement(int[] nums) {
        int l = nums.length;
        HashMap<Integer, Integer> hash = new HashMap<>();
        int res = 0;
        int majority = 0;
        for(int i = 0; i<l; i++){
            hash.put(nums[i] , 1 + hash.getOrDefault(nums[i], 0));
            if(hash.get(nums[i]) > majority){
                res = nums[i];
                majority = hash.get(nums[i]);
            }
        }
        return res;

    } 
}