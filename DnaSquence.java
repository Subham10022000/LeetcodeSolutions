package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DnaSquence {

    public List<String> findRepeatedDnaSequences(String s) {
        Map<String,Integer> map = new HashMap<>();
        for(int i =0;i<=s.length()-10;i++)
        {
            String substring = s.substring(i,i+10);
          System.out.println(map.put(substring,map.getOrDefault(substring,0)+1));

        }
        List<String> list = new ArrayList<>();
        for(Map.Entry<String,Integer> item : map.entrySet()){
            if(item.getValue()>1){
                list.add(item.getKey());
            }

        }
        System.out.println();
        System.out.println(list);
        return list;

    }

    public static void main(String[] args){
        DnaSquence ob1 = new DnaSquence();
        ob1.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCGGGTTT");

    }
}
