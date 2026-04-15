class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n=words.length;
        int res=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(words[i].equals(target)){
                int idx=Math.abs(i-startIndex);
                idx=Math.min(idx,n-idx);
                res=Math.min(res,idx);
            }
        }
        return res==Integer.MAX_VALUE?-1:res;
    }
}