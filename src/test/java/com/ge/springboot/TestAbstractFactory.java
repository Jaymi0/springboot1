package com.ge.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestAbstractFactory {

    /**
     * 抽象工厂设计模式
     */
    @Test
    public void contextLoads() {
        AbstractFactory abstractFactory = new AbstractFactory();
        apple a2 = abstractFactory.getAppleByName("A2");
        a2.say();
        apple b2 = abstractFactory.getAppleByName("B2");
        b2.say();
    }

}

/**
 * 提供Apple接口
 */
interface apple{void say();}

/**
 * 创建两个实体类实现Apple接口
 */
class A2 implements apple{
    @Override
    public void say() {
        System.out.println("A2's Apple");
    }
}
class B2 implements apple{
    @Override
    public void say() {
        System.out.println("B2's Apple");
    }
}

/**
 * 创建生产Apple对象的接口
 */
interface produce{apple get();}

/**
 * 创建两个普通工厂，实现生产Apple的produce接口，生产实体对象A2,B2
 */
class FactoryForA implements produce{
    @Override
    public apple get() {
        return new A2();
    }
}

class FactoryForB implements produce{
    @Override
    public apple get() {
        return new B2();
    }
}

/**
 * 创建一个抽象超级工厂（生产工厂的工厂），用于创建上面的生产A2,B2两对象的工厂
 */
class AbstractFactory{
    public apple getAppleByName(String name){
        apple a = null;
        if (name.equals("A2")){
            return new FactoryForA().get();
        }
        if (name.equals("B2")){
            return new FactoryForB().get();
        }
        return a;
    }
}


