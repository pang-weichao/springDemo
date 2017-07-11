package cn.pwc.test;

import cn.pwc.demo.FirstDemo;
import cn.pwc.demo.SecondDemo;
import cn.pwc.demo.ThirdDemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 26229 on 2017/5/2.
 */
public class test {

    public static void main(String[] args){

        //取得spring容器对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        //firstDemo的测试，由于在配置bean的时候，依赖注入了thirdDemo的对象，所以没有报错
        FirstDemo firstDemo = (FirstDemo) applicationContext.getBean("firstDemo");
        firstDemo.printName();
        System.out.println("--------------------end----------------------");

        //secondDemo的测试，由于在配置bean的时候没有注入thirdDemo的对象,我们将抛出的错误通过try catch抓住
        SecondDemo secondDemo = (SecondDemo) applicationContext.getBean("secondDemo");
        try{
            secondDemo.printName();
        }catch (Exception e){
            System.out.println("抛出的错误是 " + e);
        }finally {
            System.out.println("--------------------end----------------------");
        }

        //thirdDemo的测试
        ThirdDemo thirdDemo = (ThirdDemo) applicationContext.getBean("thirdDemo");
        thirdDemo.printName();
        System.out.println("--------------------end----------------------");

    }

}
