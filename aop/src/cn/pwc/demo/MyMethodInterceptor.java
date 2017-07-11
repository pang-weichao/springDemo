package cn.pwc.demo;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by xxx on 2017/5/10.
 */
public class MyMethodInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        //被调用方法的方法体前的操作
        System.out.println("环绕通知的前切入点");
        //运行被调用方法的方法体
        Object obj = methodInvocation.proceed();
        //被调用方法的方法体后的操作
        System.out.println("环绕通知的后切入点");
        return obj;
    }
}
