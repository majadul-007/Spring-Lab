package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        /*InterfaceA cA = new ClassA();
        cA.methodA();*/

        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        InterfaceA iA = applicationContext.getBean("cF", InterfaceA.class);
        System.out.println(iA.methodA());
    }
}
