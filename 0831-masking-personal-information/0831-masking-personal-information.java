class Solution {
    public String maskPII(String s) {
        StringBuilder sb=new StringBuilder();
        boolean phonecheck=true;
        if(s.charAt(0)=='(' || s.charAt(0)==')' || s.charAt(0)=='+' || s.charAt(0)=='-' || s.charAt(0)==' '){
            phonecheck=true;
        }
        else if(Character.isDigit(s.charAt(0))==true){
            phonecheck=true;
        }
        else{
            phonecheck=false;
        }
        if(phonecheck==false){
            int idx=s.indexOf('@');
            int IDX=s.indexOf('.');
            sb.append(Character.toLowerCase(s.charAt(0)));
            sb.append("*****");
            sb.append(Character.toLowerCase(s.charAt(idx-1)));
            sb.append(s.substring(idx,s.length()).toLowerCase());
            return sb.toString();
        }
        else{
            int count=0;
            StringBuilder newbie=new StringBuilder();
            StringBuilder cryspy=new StringBuilder();
            for(int i=s.length()-1;i>=0;i--){
                if(Character.isDigit(s.charAt(i))==true){
                    count++;
                    newbie.append(s.charAt(i));
                    if(count==4){
                        cryspy.append(newbie.reverse());
                    }
                    
                }
            }
            if(count==10){
                sb.append("***-***-");
                sb.append(cryspy);
            }
            else if(count==11){
                sb.append("+*-***-***-");
                sb.append(cryspy);
            }
            else if(count==12){
                sb.append("+**-***-***-");
                sb.append(cryspy);
            }
            else{
                sb.append("+***-***-***-");
                sb.append(cryspy);
            }
        }
        return sb.toString();
    }
}