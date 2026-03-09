class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int k=people.length;
        int l=0;
        int r=people.length-1;
        int count=0;
        while(k>0){
            if(people[r]==limit){
                count++;
                r--;
                k--;
            }
            else if(people[l]+people[r]==limit){
                count++;
                l++;
                r--;
                k=k-2;
            }
            else if(people[l]+people[r]>limit){
                count++;
                r--;
                k--;
            } 
            else{
                count++;
                l++;
                r--;
                k=k-2;
            }
        }
        return count;
    }
}