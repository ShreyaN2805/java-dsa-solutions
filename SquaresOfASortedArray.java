class Solution {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int arr2[] = new int[len];
        int sq;
        for (int i=0; i<len; i++){
            sq=nums[i]*nums[i];
            arr2[i] = sq;
        }
        Arrays.sort(arr2);
        return arr2;
    }
}
