package com.kgc.hello;

import com.kgc.hello.Greeting;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//spring输出测试
public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        Greeting zhangGa=(Greeting)ctx.getBean("zhangGa");//zhangGa需与Greeting id保持一致
       // Greeting rod=(Greeting)ctx.getBean("rod");
        zhangGa.sayGreeting();
        //rod.sayGreeting();
    }

}
