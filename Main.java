package com;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Example example = new Example();
        Class<?> cls = example.getClass();
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods){
            if(method.isAnnotationPresent(Test.class)){
                Test obj = method.getAnnotation(Test.class);
                method.invoke(null, obj.param1(), obj.param2());
            }
        }
    }
}
