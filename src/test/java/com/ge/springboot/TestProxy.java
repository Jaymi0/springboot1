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
        SunWuKong sunWuKong = new SunWuKong();
        sunWuKong.beautifull();
    }
}

interface OutLook{void beautifull();}

/**
 * 创建被代理人
 */
class GaoCuiLan implements OutLook{
    @Override
    public void beautifull() {
        System.out.println("被代理人，真正的高翠兰。");
    }
}

/**
 * 创建代理人
 */
class SunWuKong implements OutLook{

    private GaoCuiLan gaoCuiLan = new GaoCuiLan();

    // 代理人因为实现了跟被代理人一样的接口，拥有一样的方法
    @Override
    public void beautifull() {
        System.out.println("代理人，孙悟空变的高翠兰");
        // 代理人除了实现自己的方法，还可以调用被代理人的方法，即孙悟空不仅有自己的样子还有高翠兰的
        gaoCuiLan.beautifull();
    }
}


