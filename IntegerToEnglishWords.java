package org.Leetcode;

class IntegerToEnglishWords {

    private final String[] belowTen = new String[] {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private final String[] belowTwenty= new String[] {"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    private final String[] belowHundred= new String[] {"","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};

    public String numberToWords(int num) {
        if(num<=0) return "Zero";
        return converter(num);
    }
    private String converter(int num){
        StringBuilder result = new StringBuilder();
        if(num<10) result.append( belowTen[num]);
        else if(num<20) result.append( belowTwenty[num-10]);
        else if(num<100) result.append( belowHundred[num/10]).append(" ").append(converter(num%10));
        else if(num<1000) result.append(converter(num/100))
                .append(" Hundred ").append(converter(num%100));
        else if(num<1000000) result.append( converter(num/1000)).append(" Thousand ")
                .append(converter(num%1000));
        else if(num<1000000000) result.append(converter(num/1000000)).append(" Million ")
                .append(converter(num%1000000));
        else result.append(converter(num/1000000000)).append(" Billion ")
                    .append(converter(num%1000000000));
        return result.toString().trim();
    }
}
