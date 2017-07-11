package cn.pwc.test;

import cn.pwc.demo.FirstDemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 26229 on 2017/5/1.
 */
public class TestSpring {

    /**
     * spring创建 我们去容器当中取到对象就行
     * @param args
     */
    public static void main(String[] args){
        //获取spring容器的对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //取到对象
        FirstDemo firstDemo = (FirstDemo) applicationContext.getBean("firstDemo");
        //执行方法
        firstDemo.printName();
    }

}
