package cn.pwc.demo;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Date;

/**
 * 配置切面所完成的功能
 * Created by xxx on 2017/5/10.
 */
public class MyMethodBeforeAdvice implements MethodBeforeAdvice {
    /**
     *
     * @param method  被调用的方法
     * @param objects 给这个方法传递的参数
     * @param o       目标对象
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("--------------------------------------------------");
        System.out.println("调用"+method+"的时间是"+new Date());
    }
}
