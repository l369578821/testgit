package com.kawa;

/*
* 日志记录增强
* */

public class LoggerAdvice {
    //前置增强代码，在原有方法前执行调用
    public void before(){
        System.out.println("前置增强，执行中");
    }
    //后置增强，在原有方法后执行调用
    public void afterRuturning(){
     System.out.println("后置增强，执行中");
    }

}
