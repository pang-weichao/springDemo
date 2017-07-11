package cn.pwc.test;

import cn.pwc.demo.FirstDemo;

/**
 * Created by 26229 on 2017/4/30.
 */
public class Test {

    /**
     * 普通的创建
     * @param args
     */
    public static void main(String[] args){
        FirstDemo firstDemo = new FirstDemo();
        firstDemo.setDemoName("普通demoName");
        firstDemo.printName();
    }

}
