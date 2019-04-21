package com.oom;

public class Stack {


    public Object[] elements;

    private final int INIT_SIZE = 16;

    private int size= 0;

    public Stack(){
          elements = new Object[INIT_SIZE];
    }

    /**
     * 压栈
     */
    public void push(Object o){
            elements[0] = o;
            size++;
    }

    /**
     *  弹栈
     * @return
     */
    public Object pop(){
        size = size - 1;
        Object o = elements[size];

        return 0;
    }

}
