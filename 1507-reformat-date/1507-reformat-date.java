class Solution {
    public String reformatDate(String date) {
        int n=date.length();
        String y=date.substring(n-4,n);
        StringBuilder sb=new StringBuilder();
        boolean twodig=false;
        if(Character.isDigit(date.charAt(1))){
            sb.append(date.charAt(0));
            sb.append(date.charAt(1));
            twodig=true;
        }
        else{
            sb.append("0");
            sb.append(date.charAt(0));
            twodig=false;
        }
        String d=sb.toString();
        sb.setLength(0);
        if(twodig) sb.append(date.substring(5,8));
        else sb.append(date.substring(4,7));
        String find=sb.toString();
        sb.setLength(0);
        if(find.equals("Jan")) sb.append("01");
        else if(find.equals("Feb")) sb.append("02");
        else if(find.equals("Mar")) sb.append("03");
        else if(find.equals("Apr")) sb.append("04");
        else if(find.equals("May")) sb.append("05");
        else if(find.equals("Jun")) sb.append("06");
        else if(find.equals("Jul")) sb.append("07");
        else if(find.equals("Aug")) sb.append("08");
        else if(find.equals("Sep")) sb.append("09");
        else if(find.equals("Oct")) sb.append("10");
        else if(find.equals("Nov")) sb.append("11");
        else if(find.equals("Dec")) sb.append("12");
        String m=sb.toString();
        return y+"-"+m+"-"+d;
    }
}