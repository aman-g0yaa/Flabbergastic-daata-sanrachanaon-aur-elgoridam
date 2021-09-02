class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int n = nums.length;
            
        int[] hash = new int[101];
        
        for(int i=0;i<n;i++){
            hash[nums[i]]++;
        }
        
        int sum = 0;
        for(int i=0;i<101;i++){
            sum += hash[i];
            hash[i] = sum - hash[i];
        }
       
        
        for(int i=0;i<n;i++){
            nums[i] = hash[nums[i]];
        }
        
        return nums;
    }
}