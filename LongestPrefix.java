package org.Leetcode;

class LongestPrefix {
    public static void main(String[] args){
        String[] strs ={"Flower","Flow","Fluck"};
        LongestPrefix lp = new LongestPrefix();
       System.out.println( lp.longestCommonPrefix(strs));
    }
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        if(strs.length==0){
            return "";
        }

        for(int i=1;i<strs.length;i++){
            while((strs[i].indexOf(prefix)!=0)){
                System.out.println(strs[i].indexOf(prefix));
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
}
