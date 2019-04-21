package com.com.Instance;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    //需要动态代理的类
    private Object target;

    public ProxyFactory(Object target) {

        this.target = target;
    }

    public Object getProxyClass() {
       return  Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("let me do somehting");
                        Object invoke = method.invoke(target, args);
                        System.out.println("let do something");
                        return invoke;
                    }
                });
    }



}
