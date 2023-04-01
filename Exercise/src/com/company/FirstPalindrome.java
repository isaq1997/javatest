package com.company;

public class FirstPalindrome {
    public static void main(String[] args) {
        String s[]={"abc","car","ada","racecar","cool"};
        int k=0;
        m:for (int i=0;i<s.length;i++){
            for(int j=0;j<s[i].length()/2;j++){
                if(s[i].charAt(j)==s[i].charAt(s[i].length()-j-1)){
                    k++;
                    if(k==s[i].length()/2) {
                        System.out.println(s[i]);
                    }
                    break m;
                }
            }
        }
    }
}
