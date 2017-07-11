package cn.pwc.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by 26229 on 2017/5/3.
 */
public class FirstDemo implements BeanNameAware,BeanFactoryAware,ApplicationContextAware,InitializingBean,DisposableBean {

    private String name;

    public FirstDemo() {
        System.out.println("demo被创建");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("name的set方法别调用");
        this.name = name;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("setBeanName被调用 " + s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory被调用 " + beanFactory);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext被调用 " + applicationContext);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterProperties被调用");
    }

    public void myInit(){
        System.out.println("自定义初始化");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy被调用");
    }

    public void myDestroy(){
        System.out.println("自定义销毁方法");
    }
}
