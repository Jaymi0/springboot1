package com.ge.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestFactory {

    /**
     * 工厂设计模式
     */
    @Test
    public void contextLoads() {
        food a = get("A");
        a.eat();
        food b = get("B");
        b.eat();
        food c = get("C");
        c.eat();
        food d = get("D");
        d.eat();
    }

    /**
     * 通过实体类的名称获取实体类。
     * @param name 实体类名称
     * @return 返回food（返回值设为food接口，很好的体现了面向对象特点，接口引用指向子类对象）
     */
    public food get(String name){
        food f = null;
        if (name.equals("A")) {
            f = StatcFactory.getA();// 我们只管拿来用就行，不需要知道这个类是被创建出来的。
        }
        if (name.equals("B")) {
            f = StatcFactory.getB();
        }
        if (name.equals("C")) {
            f = StatcFactory.getC();
        }
        if (name.equals("D")) {
            f = StatcFactory.getD();
        }
        return f;
    }

}

/**
 * 定义一个接口
 */
interface food{void eat();}

/**
 * 定义实体类实现这个接口
 */
class A implements food{
    @Override
    public void eat() {
        System.out.println("A吃");
    }
}
class B implements food{
    @Override
    public void eat() {
        System.out.println("B吃");
    }
}
class C implements food{
    @Override
    public void eat() {
        System.out.println("C吃");
    }
}
class D implements food{
    @Override
    public void eat() {
        System.out.println("D吃");
    }
}

/**
 * 定义工厂类，提供获取实体类的静态方法
 */
class StatcFactory {
    private StatcFactory(){}

    public static A getA(){return new A();}
    public static B getB(){return new B();}
    public static C getC(){return new C();}
    public static D getD(){return new D();}
}

