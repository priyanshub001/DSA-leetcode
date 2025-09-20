class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int start=0;
        int sum=0;
        int minilen=Integer.MAX_VALUE;
        for(int end=0; end<nums.length; end++){
            sum += nums[end];

            while(sum>=target){
                int currlen= end-start+1;
                  sum -= nums[start];
                start++;
              
               minilen= Math.min(minilen, currlen);
            }

        }
      
        
        return (minilen==Integer.MAX_VALUE) ?0 : minilen;
        
    }
   
}