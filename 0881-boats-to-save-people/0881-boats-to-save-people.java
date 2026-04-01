class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int ans=0;
        int l=0,r=people.length-1;
        int k=people.length;
        while(k>0){
            if(people[r]==limit){
                ans++;
                k--;
                r--;
            }
            else if(people[r]+people[l]<=limit){
                ans++;
                k-=2;
                l++;
                r--;
            }
            else if(people[l]+people[r]>limit){
                ans++;
                k--;
                r--;
            }
        }
        return ans;
    }
}