class Solution {
    public int[] constructTransformedArray(int[] nums) {
	    int n = nums.length;
	    int res[] = new int[n];
	    for(int i=0; i<n; i++) {
		    if(nums[i] == 0) res[i] = 0;
		    else if(nums[i] < 0) {
			    int minus = Math.abs(nums[i])%n;
			    int new_i = i-minus;
			    if(new_i >= 0) res[i] = nums[new_i];
			    else res[i] = nums[n+new_i];
		    } else {
			    int add = nums[i]%n;
			    res[i] = nums[(i+add)%n];
		    }
	    }
	return res;
    }
}