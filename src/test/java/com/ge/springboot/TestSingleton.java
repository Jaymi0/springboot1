package com.ge.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestSingleton {
    @Test
    public void test(){

    }
}

class Singleton{
    // 私有化构造
    private Singleton(){}

    private static class SingletonBuilder{
        private static Singleton value = new Singleton();
    }

    public Singleton getInstance(){
        return SingletonBuilder.value;
    }

}
