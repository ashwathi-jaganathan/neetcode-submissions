class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int count=1;
        int j=0;
        Arrays.sort(nums);
        for(int i=1;i<n;i++) {
            if(nums[j]==nums[i]){
                count++;
                if(count>n/2) {
                    return nums[j];
                }
            }
            else{
                j=i;
                count=1;
                
                continue;
            }  
        }
        return nums[j];

    }
}