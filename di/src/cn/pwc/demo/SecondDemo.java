package cn.pwc.demo;

/**
 * Created by 26229 on 2017/5/2.
 */
public class SecondDemo {

    private String name;

    private ThirdDemo td;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ThirdDemo getTd() {
        return td;
    }

    public void setTd(ThirdDemo td) {
        this.td = td;
    }

    public void printName(){
        System.out.println("名字是 " + name);
        td.printName();
    }

}
