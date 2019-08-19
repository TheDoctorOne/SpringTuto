package com.mahmudkocas.BeanLifeCycle;

import javax.swing.JFrame;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    private static AbstractApplicationContext ctx;

    public static void main(String[] args) {
        System.out.println("go");
        ctx = new ClassPathXmlApplicationContext("Beans.xml");
        ExampleInit eInit = (ExampleInit) ctx.getBean("exampleInit");
        eInit.printMessage();
        ctx.registerShutdownHook();
        /**
         * Software calls Java's methods first compared to XML defined ones.
         */
        System.out.println("Bring me to Life!");
        
        //Life Cycle Testing purposes.
        JFrame frame = new JFrame("Testing Purposes");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0, 0, 400, 400); //When Frame closes, bean(s) gets destroyed.
    }
}