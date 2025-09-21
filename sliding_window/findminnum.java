public class findminnum {
     public int minSubArrayLen(int target, int[] nums) {

        int start=0,end=nums.length;
       

        while (start<end) {

            

            if (sum == target) {


            
            }
            else if (sum>target) {
                start++;
            }else{
                end--;
            }
            
        }

     }
     public static void main(String[] args) {
          int arr[]={2,3,1,2,4,3};
        int k=7;

        findminnum f = new findminnum();
        f.minSubArrayLen(k, arr);

}
}
