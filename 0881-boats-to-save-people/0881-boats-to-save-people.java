class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int k=people.length;
        int l=0,r=k-1;
        int count=0;
        while(k>0){
            if(people[r]==limit){
                k--;
                r--;
            }
            else if(people[l]+people[r]<=limit){
                k=k-2;
                l++;
                r--;
            }
            else if(people[r]+people[l]>limit){
                k--;
                r--;
            }
            count++;
        }
        return count;
    }
}