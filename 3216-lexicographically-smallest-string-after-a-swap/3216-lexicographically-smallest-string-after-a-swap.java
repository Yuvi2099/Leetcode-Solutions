class Solution {
    public String getSmallestString(String s) {
        int n=s.length();
        String even="02468";
        String odd="13579";
        char[]arr=s.toCharArray();
        for(int i=1;i<n;i++){
            char ch=arr[i];
            char bh=arr[i-1];
            if(bh>ch){
                if((odd.indexOf(ch)!=-1 && odd.indexOf(bh)!=-1) || (even.indexOf(ch)!=-1 && even.indexOf(bh)!=-1)){
                    arr[i]=bh;
                    arr[i-1]=ch;
                    break;
                }
            }
        }
        return new String(arr);
    }
}