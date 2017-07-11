package cn.pwc.demo;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by xxx on 2017/5/10.
 */
public class MyMethodAfterAdvice implements AfterReturningAdvice {
    /**
     *
     * @param o         被调用方法的返回值
     * @param method    被调用的方法
     * @param objects   被调用方法传的参数
     * @param o1        目标对象
     * @throws Throwable
     */
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("后置通知被调用啦");
        System.out.println("-------------------------------------");
    }
}
