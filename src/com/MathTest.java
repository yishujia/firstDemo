package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MathTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Iterator iterator = list.iterator();
        String str="";
        while (iterator.hasNext()) {
            str = (String) iterator.next();

            if (str.equals("3")) {
                iterator.remove();
            }
        }

        for(String u : list){
            System.out.println(u);
        }

    }

}