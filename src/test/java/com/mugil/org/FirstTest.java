package com.mugil.org;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
class FirstTest extends BaseUnitTest{
    @Test
    void oneSecondTest() throws InterruptedException {
        System.out.println("oneSecondTest() name  =>  " + Thread.currentThread().getName());
        Thread.sleep(1000);
    }

    @Test
    void twoSecondTest() throws InterruptedException {
        System.out.println("twoSecondTest() name => " + Thread.currentThread().getName());
        Thread.sleep(2000);
    }

    @Test
    void threeSecondTest() throws InterruptedException {
        System.out.println("threeSecondTest() name => " + Thread.currentThread().getName());
        Thread.sleep(3000);
    }
}
