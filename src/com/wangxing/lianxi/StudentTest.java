package com.wangxing.lianxi;

public class StudentTest {
    public static void main(String[] args) {
        String s="welcome to china";
        String[] str=s.split(" ");
        int count=str[str.length-1].length();
        System.out.println(count);
    }
}
