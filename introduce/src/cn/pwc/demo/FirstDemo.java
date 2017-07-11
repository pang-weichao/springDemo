package cn.pwc.demo;

/**
 * Created by 26229 on 2017/4/30.
 */
public class FirstDemo {

    private String demoName;

    public String getDemoName() {
        return demoName;
    }

    public void setDemoName(String demoName) {
        this.demoName = demoName;
    }

    public void printName(){
        System.out.println("demo名字是 " + demoName);
    }
}
