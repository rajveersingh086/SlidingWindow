public class minlength {

    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int j =0;
        int sum=0;
        int minlength = Integer.MAX_VALUE;  
        for(int i=0;i<n;i++){
            sum += nums[i];
            while(sum>=target){
                minlength=Math.min(minlength,i-j+1);
                sum-=nums[j++];
            }
        }
        return (minlength==Integer.MAX_VALUE) ?0:minlength;
    }
}