package com.kgc.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//测试打印机
public class PrintTest {
    public static void main(String[] args) {
        //通过ClassPathXmlApplicationContext获取实例化Spring的上下文对象
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");

        //通过id获取实例
        Printer printer=(Printer)ctx.getBean("printer");
        printer.print();

    }
}
