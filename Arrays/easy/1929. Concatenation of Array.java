class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int n = candies.length;
        
        int maxCandies = 0;
        
        List<Boolean> ans = new ArrayList<Boolean>();
        
        for(int i=0;i<n;i++){
            maxCandies = Math.max(maxCandies , candies[i]);
        }
        
        for(int i=0;i<n;i++){
            
            int curCandies = candies[i] + extraCandies;
            if(curCandies >= maxCandies)
                ans.add(true);
            else
                ans.add(false);
        }
        
        return ans;
        
        
    }
}