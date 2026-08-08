class Solution {
    public int missingNumber(int[] nums) {
        int miss;
        int sum=0;
        int sum2=0;
        int len = nums.length;
        for (int i=0; i<len+1; i++){
            sum=sum+i;
        }
        for (int j=0; j<len; j++){
            sum2=sum2+nums[j];
        }
        miss = sum-sum2;
        return miss;
    }
}
