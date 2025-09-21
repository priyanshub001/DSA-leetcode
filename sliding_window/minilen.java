
class minilen {
    public  void minSubArrayLen(int target, int[] nums) {

        int start=0;
        int sum=0;
        int minilenmm=Integer.MAX_VALUE;
        for(int end=0; end<nums.length; end++){
            sum += nums[end];

            while(sum>=target){
                int currlen= end-start+1;
                  sum -= nums[start];
                start++;
              
               minilenmm= Math.min(minilenmm, currlen);
            }

        }
        if (sum==Integer.MAX_VALUE) {
            System.out.println(0);
        }else{
            System.out.println(minilenmm);
        }
        
        
        
    }
    public static void main(String[] args) {
        int arr[]={4,4,4};
        int k=7;
        minilen m = new minilen();

        m.minSubArrayLen(k, arr);
        

    }
}