class Solution {
    public int[] validSequence(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int[]match=new int[n];
        int i=n-1,j=m-1;
        int count=0;
        while(i>=0){
            if(j>=0 && word1.charAt(i)==word2.charAt(j)){
                count++;
                j--;
            }
            match[i]=count;
            i--;
        }
        int[]seq=new int[m];
        boolean available=true;
        i=0;
        j=0;
        while(i<n && j<m){
            if(word1.charAt(i)==word2.charAt(j)){
                seq[j]=i;
                j++;
            } 
            else if(available==true && i+1<n && match[i+1]>=m-j-1){
                seq[j]=i;
                j++;
                available=false;
            }
            i++;
        }
        if(j==m) return seq;
        return new int[0];
    }
}