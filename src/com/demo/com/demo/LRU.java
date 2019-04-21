package com.demo.com.demo;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRU extends LinkedHashMap {


    private Integer cacheLength;


    public LRU(Integer cacheLenght){

        super((int)Math.ceil(cacheLenght*0.75)+1,0.75f,true);
        this.cacheLength = cacheLenght;
    }


    //当缓存的数据大于长度时， 删除最近访问次数最少的数据
    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size() > cacheLength;
    }

    public static void main(String[] args) {
        double num = Math.round(12.4);

        System.out.println(num);
    }
}
