package cn.pwc.demo;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * Created by xxx on 2017/5/10.
 */
public class MyMethodThrowAdvice implements ThrowsAdvice {

    public void afterThrowing(Throwable throwable){
        System.out.println("异常通知被调用");
    }

}
