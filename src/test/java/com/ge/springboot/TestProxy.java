package com.ge.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestProxy {
    @Test
    public void test(){
        Proxy proxy = new Proxy();
        proxy.method();
    }
}

interface Source{void method();}

class OldClass implements Source{
    @Override
    public void method() {
        System.out.println("被代理类的方法正在执行。。");
    }
}

class Proxy implements Source{
    private Source source = new OldClass();

    private void doSomething(){}

    @Override
    public void method() {
        System.out.println("代理类的方法正在执行。。");
//        new Class1.Fun1();
        source.method();
//        new Class2.Fun2();
        doSomething();
    }
}

