package cn.pwc.demo;

/**
 * Created by xxx on 2017/5/10.
 */
public class FirstDemo implements NameDemo,AgeDemo {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 该方法继承自NameDemo
     */
    @Override
    public void printName() {
        System.out.println("执行pringName "+name);
    }

    @Override
    public void printAge() {
        System.out.println("我100岁啦！");
        int i = 1/0;
    }
}
