package cn.pwc.test;

import cn.pwc.demo.AgeDemo;
import cn.pwc.demo.NameDemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xxx on 2017/5/10.
 */
public class Test {

    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        NameDemo demo = (NameDemo) applicationContext.getBean("proxyFactoryBean");
        demo.printName();
        ((AgeDemo)demo).printAge();
    }

}
