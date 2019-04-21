package com.demo;

/**
 *
 */
public class Test {


   public static class User{

        public Integer id =1;
        public String name="";



    }


    public static void allcoke(){
        User user = new User();
        user.id= 2;
        user.name="lisi";
    }


    public static void main(String[] args) {
        long begin = System.currentTimeMillis();

        for(int i = 0 ; i<10000000; i++){

            allcoke();

        }
        long end = System.currentTimeMillis();

        System.out.println((end - begin)+"ms");

    }

}

