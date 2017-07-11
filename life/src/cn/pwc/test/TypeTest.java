package cn.pwc.test;

import cn.pwc.demo.SecondDemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 26229 on 2017/5/3.
 */
public class TypeTest {

    //测试作用域
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("----------------------begin-------------------------");
        SecondDemo s1 = (SecondDemo) applicationContext.getBean("secondDemo");
        SecondDemo s2 = (SecondDemo) applicationContext.getBean("secondDemo");
        System.out.println("----------------------end-------------------------");
        System.out.println(s1 + "    " + s2);
    }

}
