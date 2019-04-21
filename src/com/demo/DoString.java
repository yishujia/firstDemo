package com.demo;

/**
 * String 类的常用API
 */
public class DoString {

    public static void main(String[] args) {
        String str1 = "You are Good Man Body";
        String str2 ="You are Body Man";
        //charAt 获取指定索引位置的字符
        char c = str1.charAt(4);

        System.out.println(c);
        //忽略大小写来比较
        if(str1.equalsIgnoreCase(str2))
            System.out.println("gggg");

        //IndexOf 返回指定位置是什么字符串
        int index = str1.indexOf("3");

        String replace = str1.replace("You", "We");
        System.out.println(replace);

        //subString  1.可以截取字符串  含头不含尾
        // 2.从指定位置开始截取后面所有的字符
        String substring = str1.substring(7);
        System.out.println(substring);

        System.out.println("a".compareTo("a"));// compareTo 按字典来比较

        System.out.println(str1.contains("you")); //是否包含某个字符

        System.out.println(str1.endsWith("you")); //是否以指定后缀结尾

        byte[] bytes = str1.getBytes();
        for (byte b : bytes){
            System.out.print(b );
        }

        System.out.println();
        String[] strs = str1.split(" ");

        for (String s :strs){
            System.out.print(s+",");
        }
        System.out.println();
        String valus = String.valueOf(2);

        System.out.println(valus);

    }

}
