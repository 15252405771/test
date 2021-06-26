package com.wangxing.lianxi;

public class StudentTest {
    //得到一个字符串的最后一个单词的长度
    public static void main(String[] args) {
        //定义一个String
        String s="welcome to china";
        //用split方法根据单词与单词间的空格字符串分割成数组
        String[] str=s.split(" ");
        //取最后一个单词的长度
        int count=str[str.length-1].length();
        System.out.println(count);
    }
}
